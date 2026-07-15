import java.util.ArrayList;

public class ArrayListGetDemo{
    public static void main(String[]args){

        ArrayList<String> fruits = new ArrayList();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Grapes");
        fruits.add("Watermelon");

        System.out.println("First Fruit: "+fruits.get(0));
        System.out.println("Third Fruit: "+fruits.get(2));
        System.out.println("Last Fruit: "+fruits.get(5));

    }
}
