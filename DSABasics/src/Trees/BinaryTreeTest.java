package Trees;

public class BinaryTreeTest {
    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode(10);
        BinaryTreeNode left = new BinaryTreeNode(20);
        BinaryTreeNode right = new BinaryTreeNode(30);

        root.setLeft(left);
        root.setRight(right);

        System.out.println("InOrder Tree Traversal - Recursive");
        inOrderTraversal(root);
        System.out.println("PreOrder Tree Traversal - Recursive");
        preOrderTraversal(root);
        System.out.println("PostOrder Tree Traversal - Recursive");
        postOrderTraversal(root);
    }

//   InOrder tree traversal
//    1.Process left subtree
//    2.Process root node
//    3.Process right subtree
    private static void inOrderTraversal(BinaryTreeNode root) {
        if(root!=null) {
            inOrderTraversal(root.getLeft());
            System.out.println(root.getData());
            inOrderTraversal(root.getRight());
        }
    }
//   PreOrder tree traversal
//    1.Process root node
//    2.Process left subtree
//    3.Process right subtree

    private static void preOrderTraversal(BinaryTreeNode root) {
        if(root != null) {
            System.out.println(root.getData());
            preOrderTraversal(root.getLeft());
            preOrderTraversal(root.getRight());
        }
    }

//   PreOrder tree traversal
//    1.Process left subtree
//    2.Process right subtree
//    3.Process root node
    private static void postOrderTraversal(BinaryTreeNode root) {
        if(root != null) {
            postOrderTraversal(root.getLeft());
            postOrderTraversal(root.getRight());
            System.out.println(root.getData());
        }
    }
}
