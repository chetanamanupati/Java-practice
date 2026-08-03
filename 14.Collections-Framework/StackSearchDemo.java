import java.util.Stack;

public class StackSearchDemo {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("Java");
        stack.push("SQL");
        stack.push("DBMS");
        stack.push("Spring Boot");

        System.out.println(stack.search("Spring Boot"));

        System.out.println(stack.search("SQL"));

        System.out.println(stack.search("Python"));

    }
}
