import java.util.TreeSet;

public class TreeSetIsEmptyDemo {
     public static void main(String[]args){
        TreeSet<String> program = new TreeSet<>();

        System.out.println(program.isEmpty());

        program.add("Java");
        program.add("Python");
        program.add("SQL");

        System.out.println(program.isEmpty());
     }    

    
}
