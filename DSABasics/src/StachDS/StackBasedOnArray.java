package StachDS;

public class StackBasedOnArray {
    private int capacity;
    private final int CAPACITY = 10;
    private int[] stack;
    private int top = -1;
    public StackBasedOnArray() {
        this.stack = new int[this.CAPACITY];
    }
    public StackBasedOnArray(int capacity) {
        this.capacity = capacity;
        this.stack = new int[this.capacity];
    }
    public boolean isEmpty() {
        return (this.top == -1);
    }
    public  int peek() {
        return this.top+1;
    }
    public void push(int data) throws Exception {
        if(this.top == capacity) {
            throw new Exception("Stack is FULL : OVERFLOW");
        }
        stack[++top] = data;
        //top++;
    }
    public int pop() throws Exception {
        if (this.top == -1) {
            throw new Exception("Stack is EMPTY : UNDERFLOW");
        }
        int data = stack[top];
        stack[top--] = Integer.MIN_VALUE;
        return data;
    }
    public String toString() {
        String result = "[";
        for (int itr:
             stack) {
            result += itr + " ";
        }
        return result + "]";
    }

}
