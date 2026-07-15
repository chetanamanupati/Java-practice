import java.util.ArrayList;

public class ArrayListRemoveDemo {

    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");

        fruits.remove(1);

        System.out.println(fruits);

    }
}
