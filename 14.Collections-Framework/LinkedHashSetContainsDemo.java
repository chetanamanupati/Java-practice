import java.util.LinkedHashSet;

public class LinkedHashSetContainsDemo {
    public static void main(String[]args){
        LinkedHashSet<String> program=new LinkedHashSet<>();

        program.add("Java");
        program.add("Python");
        program.add("SQL");

        System.out.println(program.contains("Java"));
        System.out.println(program.contains("C++"));
        

    }
}
