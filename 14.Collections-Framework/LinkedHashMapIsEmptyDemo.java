import java.util.LinkedHashMap;

public class LinkedHashMapIsEmptyDemo {
     public static void main(String[]args){
        LinkedHashMap<Integer, String> students = new LinkedHashMap<>();

        System.out.println(students.isEmpty());

        students.put(101,"Chetana");
        students.put(102,"Mahi");
        students.put(103,"Uday");
        students.put(104,"Hespibah");

        System.out.println(students.isEmpty());

    }    
}
