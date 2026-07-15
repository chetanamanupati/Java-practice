import java.util.ArrayList;

public class FruitsList{
    public static void main(String[]args){
        ArrayList<String> fruits= new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Grapes");
        fruits.add("Watermelon");
        fruits.add(1,"Banana");

        System.out.println(fruits);
    }
}
