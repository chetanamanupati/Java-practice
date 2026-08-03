import java.util.ArrayList;
import java.util.Collections;

public class CollectionsBinarySearchDemo {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(40);
        list.add(10);
        list.add(30);
        list.add(20);

        Collections.sort(list);

        System.out.println("Sorted List: " + list);

        System.out.println("Index of 30: " +
                Collections.binarySearch(list, 30));

        System.out.println("Index of 10: " +
                Collections.binarySearch(list, 10));

    }
}
