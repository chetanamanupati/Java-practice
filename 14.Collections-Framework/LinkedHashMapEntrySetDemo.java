import java.util.LinkedHashMap;

public class LinkedHashMapEntrySetDemo {
    public static void main(String[]args){
        LinkedHashMap<Integer,String> students=new LinkedHashMap<>();
    
        students.put(102,"Chetana");
        students.put(104,"Mahi");

        System.out.println(students.entrySet());
    }
}
