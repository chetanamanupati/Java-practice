import java.util.Stack;

public class StackPeekDemo {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("Java");
        stack.push("SQL");
        stack.push("DBMS");

        System.out.println("Top Element: " + stack.peek());

        System.out.println("Stack: " + stack);

    }
}
