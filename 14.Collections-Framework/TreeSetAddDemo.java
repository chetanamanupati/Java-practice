import java.util.TreeSet;

public class TreeSetAddDemo {
    public static void main(String[]args){
        TreeSet<String> program= new TreeSet<>();

        System.out.println(program.add("Java"));
        System.out.println(program.add("Python"));
        System.out.println(program.add("Java"));
        System.out.println(program.add("SQL"));

        System.out.println(program);
    }
}
