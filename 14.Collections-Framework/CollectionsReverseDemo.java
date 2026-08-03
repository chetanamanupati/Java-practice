import java.util.ArrayList;
import java.util.Collections;

public class CollectionsReverseDemo {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("Before Reverse: " + list);

        Collections.reverse(list);

        System.out.println("After Reverse: " + list);

    }
}
