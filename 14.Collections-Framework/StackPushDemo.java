import java.util.Stack;

public class StackPushDemo {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("Java");
        stack.push("SQL");
        stack.push("DBMS");
        stack.push("Spring Boot");

        System.out.println(stack);
    }
}
