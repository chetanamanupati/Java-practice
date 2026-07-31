import java.util.TreeMap;

public class TreeMapRemoveDemo {
    public static void main(String[]args){
        TreeMap<Integer, String> students = new TreeMap<>();

        students.put(103, "Uday");
        students.put(101, "Chetana");
        students.put(104, "Hespibah");
        students.put(102, "Mahi");

        students.remove(102);

        System.out.println(students);
    }
}
