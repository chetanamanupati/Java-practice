import java.util.TreeMap;

public class TreeMapIsEmptyDemo {
    public static void main(String[]args){
        TreeMap<Integer,String> students= new TreeMap<>();
        
        System.out.println(students.isEmpty());

        students.put(103, "Uday");
        students.put(101, "Chetana");

        System.out.println(students.isEmpty());
    }
}
