import java.util.Stack;

public class StackEmptyDemo {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        System.out.println(stack.empty());

        stack.push("Java");
        stack.push("SQL");

        System.out.println(stack.empty());

    }
}