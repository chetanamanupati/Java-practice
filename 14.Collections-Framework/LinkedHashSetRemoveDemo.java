import java.util.LinkedHashSet;

public class LinkedHashSetRemoveDemo {
    public static void main(String[]args){
        LinkedHashSet<String> program=new LinkedHashSet<>();

        program.add("Java");
        program.add("Python");
        program.add("SQL");

        System.out.println(program.remove("Java"));
        System.out.println(program.remove("C++")); 
        System.out.println(program);

    }
}
