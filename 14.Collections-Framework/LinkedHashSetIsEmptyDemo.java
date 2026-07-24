import java.util.LinkedHashSet;


public class LinkedHashSetIsEmptyDemo {
     public static void main(String[]args){
        LinkedHashSet<String> program=new LinkedHashSet<>();
       
        System.out.println(program.isEmpty());

        program.add("Java");
        program.add("Python");
        program.add("SQL");
        program.add("Java");

        System.out.println(program.isEmpty());
        System.out.println(program);

}
}


    

