import java.util.ArrayList;
import java.util.Collections;

public class CollectionsSwapDemo {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("SQL");
        list.add("DBMS");
        list.add("Spring");

        System.out.println("Before Swap: " + list);

        Collections.swap(list, 1, 3);

        System.out.println("After Swap: " + list);

    }
}
