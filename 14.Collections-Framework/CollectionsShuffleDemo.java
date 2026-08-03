import java.util.ArrayList;
import java.util.Collections;

public class CollectionsShuffleDemo {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("Before Shuffle: " + list);

        Collections.shuffle(list);

        System.out.println("After Shuffle: " + list);

    }
}
