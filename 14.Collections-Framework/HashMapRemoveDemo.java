import java.util.HashMap;

public class HashMapRemoveDemo {
    public static void main(String[]args){
        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Chetana");
        students.put(102, "Rahul");
        students.put(103, "Priya");

        students.remove(102);

        System.out.println(students);
    }
}
