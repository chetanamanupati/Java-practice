import java .util.HashMap;

public class HashMapEntrySetDemo {
    public static void main(String[]args){
        HashMap<Integer, String> students = new HashMap<>();

        students.put(101,"Chetana");
        students.put(102,"Mahi");
        students.put(103,"Uday");
        students.put(104,"Hespibah");

        System.out.println(students.entrySet());
    }
}
