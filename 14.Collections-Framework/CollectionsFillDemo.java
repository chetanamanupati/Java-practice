import java.util.ArrayList;
import java.util.Collections;

public class CollectionsFillDemo {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("SQL");
        list.add("DBMS");

        System.out.println("Before Fill: " + list);

        Collections.fill(list, "Programming");

        System.out.println("After Fill: " + list);

    }
}