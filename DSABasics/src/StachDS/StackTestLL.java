package StachDS;

public class StackTestLL {
    public static void main(String[] args) throws Exception {
        var llStack = new StackBasedOnLL<Character>();
        System.out.println("Is Empty function call - "+llStack.isEmpty());
        //System.out.println(llStack.pop());
        llStack.push('T');
        llStack.push('H');
        llStack.push('A');
        llStack.push('R');
        llStack.push('U');
        llStack.push('N');
        System.out.println(llStack.toString());
        System.out.println(llStack.peek());
        llStack.pop();
        llStack.pop();
        System.out.println(llStack.toString());
        System.out.println(llStack.peek());
    }
}
