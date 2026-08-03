import java.util.ArrayList;
import java.util.Collections;

public class CollectionsMaxDemo {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(40);
        list.add(10);
        list.add(80);
        list.add(20);

        System.out.println("List: " + list);

        System.out.println("Maximum Element: " + Collections.max(list));

    }
}