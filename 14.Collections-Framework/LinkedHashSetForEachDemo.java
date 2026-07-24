import java.util.LinkedHashSet;

public class LinkedHashSetForEachDemo {
     public static void main(String[]args){
        LinkedHashSet<String> program=new LinkedHashSet<>();

        program.add("Java");
        program.add("Python");
        program.add("SQL");
        program.add("Java");

        for(String language:program){
            System.out.println(language);
        }
    }    
    
}
