import java.util.Stack;

public class StackPopDemo {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("Java");
        stack.push("SQL");
        stack.push("DBMS");
        stack.push("Spring Boot");

        System.out.println("Before Pop: " + stack);

        System.out.println("Removed: " + stack.pop());

        System.out.println("After Pop: " + stack);

    }
}
