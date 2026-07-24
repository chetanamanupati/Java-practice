import java.util.LinkedHashSet;


public class LinkedHashSetSizeDemo {
     public static void main(String[]args){
        LinkedHashSet<String> program=new LinkedHashSet<>();

        program.add("Java");
        program.add("Python");
        program.add("SQL");
        program.add("Java");

        System.out.println(program.size());
        System.out.println(program);

}
}
