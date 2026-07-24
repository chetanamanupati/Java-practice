import java.util.TreeSet;

public class TreeSetClearDemo {
    public static void main(String[]args){
        TreeSet<String> program = new TreeSet<>();

        program.add("Java");
        program.add("Python");
        program.add("SQL");

        System.out.println(program);

        program.clear();

        System.out.println(program);
        System.out.println(program.isEmpty());
     }    
    
}
