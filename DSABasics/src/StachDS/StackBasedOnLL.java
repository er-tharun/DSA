package StachDS;

public class StackBasedOnLL<T> {
    private ListNode<T> top;
    private int length = 0;
    //private ListNode head;

    public StackBasedOnLL() {
        this.top = null;
    }

    public  boolean isEmpty() {
        return top == null;
    }

    public void push(T data) {
        var node = new ListNode<T>(data);
        node.setNext(top);
        top = node;
        length++;
    }

    public T pop() throws Exception {
        if(isEmpty()) {
            throw new Exception("Stack is empty : UNDERFLOW");
        }
        else {
            var temp = top.getData();
            top = top.getNext();
            length--;
            return (T) temp;
        }
    }

    public T peek() throws NullPointerException {
        if(isEmpty()) {
            throw new NullPointerException("Stack is Empty");
        }
        return top.getData();
    }

    public String toString() {
        String result = "[";
        var tempNode = top;
        while(tempNode != null && tempNode.getNext() != null) {
            result += tempNode.getData() + ",";
            tempNode = tempNode.getNext();
        }
        return result + tempNode.getData() + "]";
    }
}
