import java.util.HashMap;

public class HashMapSizeDemo {
    public static void main(String[]args){
        HashMap<Integer, String> students = new HashMap<>();

        students.put(101,"Chetana");
        students.put(102,"Rahul");
        students.put(103,"Priya");
        students.put(104,"Riya");

        System.out.println(students.size());
    }
}
