import java.util.HashMap;

public class HashMapContainsValueDemo {
    public static void main(String[]args){
        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Chetana");
        students.put(102, "Rahul");
        students.put(103, "Priya");

       System.out.println(students.containsValue("Rahul"));
       System.out.println(students.containsValue("Ravi"));
    }
}
