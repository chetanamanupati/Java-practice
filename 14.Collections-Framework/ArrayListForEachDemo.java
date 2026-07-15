import java.util.ArrayList;

public class ArrayListForEachDemo{
    public static void main(String[]args){
        ArrayList<String> fruits= new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Banana");

        for(String fruit : fruits){
            System.out.println(fruit);

        }
    }
}
