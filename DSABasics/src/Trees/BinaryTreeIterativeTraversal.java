package Trees;

import java.util.*;

public class BinaryTreeIterativeTraversal {
    public static void main(String[] args) {
        var root = new BinaryTreeNode(1);
        var lc1 = new BinaryTreeNode(2);
        var rc1 = new BinaryTreeNode(3);
        root.setLeft(lc1);
        root.setRight(rc1);
        var l1 = new BinaryTreeNode(4);
        var l2 = new BinaryTreeNode(5);
        var l3 = new BinaryTreeNode(6);
        var l4 = new BinaryTreeNode(7);
        lc1.setLeft(l1);
        lc1.setRight(l2);
        rc1.setLeft(l3);
        rc1.setRight(l4);

        var result = levelOrderTraversal(root);

        System.out.println("Iterative Traversal");

        for (var data : result) {
            for(var itr:data) {
                System.out.print(itr + " ");
            }
        }

        System.out.println("\n");
        System.out.println("PreOrder Traversal");
        var preOrder = preOrderTraversal(root);
        for(int itr: preOrder) {
            System.out.print(itr + " ");
        }

        System.out.println("\n");
        System.out.println("InOrder Traversal");
        var inOrder = inOrderTraversal(root);
        for(int itr:inOrder) {
            System.out.print(itr + " ");
        }
    }

    public static ArrayList<ArrayList<Integer>> levelOrderTraversal(BinaryTreeNode root) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
        queue.offer(root);
        queue.offer(null);
        List<Integer> curr = new ArrayList<Integer>();
        while(!queue.isEmpty()) {
            var temp = queue.poll();
            if(temp != null) {
                curr.add(temp.getData());
                if (temp.getLeft() != null) {
                    queue.offer(temp.getLeft());
                }
                if (temp.getRight() != null) {
                    queue.offer((temp.getRight()));
                }
            }
            else {
                ArrayList<Integer> c_curr = new ArrayList<Integer>(curr);
                result.add(c_curr);
                curr.clear();
                if(!queue.isEmpty()) {
                    queue.offer(null);
                }
            }
        }
        return result;
    }
    public static List<Integer> preOrderTraversal(BinaryTreeNode root) {
        var result = new ArrayList<Integer>();

        Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
        if(root == null)
            return result;
        else {
            stack.push(root);
            while(!stack.isEmpty()) {
                var temp = stack.pop();
                if(temp != null) {
                    result.add(temp.getData());
                }
                //Since Stack follow LIFO. in preorder we process left subtree first and the right subtree
                //So pushing right subtree to stack before left subtree
                if(temp.getRight() != null) {
                    stack.push(temp.getRight());
                }
                if(temp.getLeft() != null) {
                    stack.push(temp.getLeft());
                }
            }
        }
        return result;
    }

    public static List<Integer> inOrderTraversal(BinaryTreeNode root) {
        var result = new ArrayList<Integer>();

        Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
        BinaryTreeNode current = root;
        while(true) {
            if(current != null) {
                stack.push(current);
                current = current.getLeft();
            }
            else {
                if(stack.isEmpty())
                    break;
                var top = stack.pop();
                result.add(top.getData());
                current = top.getRight();
            }
        }
        return result;
    }
}
