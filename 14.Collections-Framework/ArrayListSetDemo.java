import java.util.ArrayList;

public class ArrayListSetDemo{
    public static void main(String[]args){
        ArrayList<String> fruits= new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");

        fruits.set(1,"Banana");

        System.out.println(fruits);
    }
}
