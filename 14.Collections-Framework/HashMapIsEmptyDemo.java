import java.util.HashMap;

public class HashMapIsEmptyDemo {
    public static void main(String[]args){
        HashMap<Integer,String> students= new HashMap<>();

        System.out.println(students.isEmpty());

        students.put(101,"Chetana");
        students.put(102,"Rahul");

        System.out.println(students.isEmpty());
    }
}
