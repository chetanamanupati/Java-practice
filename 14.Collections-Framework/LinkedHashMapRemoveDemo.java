import java.util.LinkedHashMap;

public class LinkedHashMapRemoveDemo {
     public static void main(String[]args){
        LinkedHashMap<Integer, String> students = new LinkedHashMap<>();

        students.put(101,"Chetana");
        students.put(102,"Mahi");
        students.put(103,"Uday");
        students.put(104,"Hespibah");

        students.remove(102);

        System.out.println(students);
    
    }    
}
