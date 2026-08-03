import java.util.ArrayList;
import java.util.Collections;

public class CollectionsSortDemo {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(40);
        list.add(10);
        list.add(30);
        list.add(20);

        System.out.println("Before Sort: " + list);

        Collections.sort(list);

        System.out.println("After Sort: " + list);

    }
}