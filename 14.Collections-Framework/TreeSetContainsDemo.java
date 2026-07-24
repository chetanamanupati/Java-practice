import java.util.TreeSet;

public class TreeSetContainsDemo {
    public static void main(String[]args){
        TreeSet<String> program = new TreeSet<>();

        program.add("Java");
        program.add("Python");
        program.add("SQL");

        System.out.println(program.contains("Java"));
        System.out.println(program.contains("C++"));
        System.out.println(program.contains("SQL"));
        
    }
}
