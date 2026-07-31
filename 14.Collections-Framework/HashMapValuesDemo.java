import java.util.HashMap;

public class HashMapValuesDemo {
    public static void main(String[]args){
        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Chetana");
        students.put(102, "Rahul");
        students.put(103, "Priya");

        System.out.println(students.values());
    }
}
