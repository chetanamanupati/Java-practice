import java.util.ArrayList;
import java.util.Collections;

public class CollectionsFrequencyDemo {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("SQL");
        list.add("Java");
        list.add("DBMS");
        list.add("Java");

        System.out.println(list);

        System.out.println("Frequency of Java: " +
                Collections.frequency(list, "Java"));

        System.out.println("Frequency of SQL: " +
                Collections.frequency(list, "SQL"));

    }
}
