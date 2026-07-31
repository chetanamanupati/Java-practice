import java.util.HashMap;

public class HashMapGet {
    public static void main(String[]args){
        HashMap<Integer,String> students= new HashMap<>();

        students.put(101,"Chetana");
        students.put(102,"Rahul");
        students.put(103,"Priya");

        System.out.println(students.get(101));
        System.out.println(students.get(104));
    }
}
