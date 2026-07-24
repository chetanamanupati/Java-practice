import java.util.TreeSet;

public class TreeSetForEachDemo {
     public static void main(String[]args){
        TreeSet<String> program = new TreeSet<>();

        program.add("Java");
        program.add("Python");
        program.add("SQL");

        for(String language:program){
            System.out.println(language);
        }
     }    

}
