import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[]args){
        TreeMap<Integer,String> students=new TreeMap<>();

        students.put(103,"Uday");
        students.put(101,"Chetana");
        students.put(104,"Hepsibah");
        students.put(102,"Mahi");

        System.out.println(students);
    }
}
