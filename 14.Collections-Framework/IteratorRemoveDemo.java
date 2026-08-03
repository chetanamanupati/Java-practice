import java.util.ArrayList;
import java.util.Iterator;

public class IteratorRemoveDemo {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("SQL");
        list.add("DBMS");

        Iterator<String> it = list.iterator();

        System.out.println("Before Remove: " + list);

        it.next();      
        it.remove();    

        System.out.println("After Remove: " + list);
    }
}
