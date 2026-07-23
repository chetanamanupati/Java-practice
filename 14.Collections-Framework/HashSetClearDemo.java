import java.util.HashSet;

public class HashSetClearDemo {
    public static void main(String[]args){
        HashSet<String> fruits=new HashSet<>();

        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Mango");

        System.out.println(fruits);
        fruits.clear();
        System.out.println(fruits);

    }
    
}
