import java.util.ArrayList;

public class ArrayListContainsDemo {
    public static void main(String[]args){
        ArrayList<String> fruits= new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");
        
        System.out.println(fruits.contains("Banana"));
        System.out.println(fruits.contains("Mango"));

    }
    
}
