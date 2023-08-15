package StachDS;

public class StackTest {
    public static void main(String[] args) throws Exception {
        StackBasedOnArray s = new StackBasedOnArray(20);
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(
        s.pop());
        System.out.println(s.toString());

    }
}
