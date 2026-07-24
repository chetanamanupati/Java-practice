import java.util.TreeSet;

public class TreeSetRemoveDemo {
    public static void main(String[]args){
        TreeSet<String> program = new TreeSet<>();

        program.add("Java");
        program.add("Python");
        program.add("SQL");

        System.out.println(program.remove("Python"));
        System.err.println(program.remove("C++"));

        System.out.println(program);
    }
}
