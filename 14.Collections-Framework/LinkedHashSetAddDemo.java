import java.util.LinkedHashSet;

public class LinkedHashSetAddDemo {
    public static void main(String[]args){
        LinkedHashSet<String> program= new LinkedHashSet<>();

        boolean r1= program.add("Java");
        boolean r2= program.add("Python");
        boolean r3= program.add("Java");

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(program);
    }
}
