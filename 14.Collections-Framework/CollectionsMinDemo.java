import java.util.ArrayList;
import java.util.Collections;

public class CollectionsMinDemo {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(40);
        list.add(10);
        list.add(80);
        list.add(20);

        System.out.println("List: " + list);

        System.out.println("Minimum Element: " + Collections.min(list));

    }
}