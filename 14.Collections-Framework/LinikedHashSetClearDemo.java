import java.util.LinkedHashSet;

public class LinikedHashSetClearDemo {
    public static void main(String[]args){
        LinkedHashSet<String> program=new LinkedHashSet<>();

        program.add("Java");
        program.add("Python");
        program.add("SQL");  

        System.out.println(program);

        program.clear();

        System.out.println(program);

    }    
}
