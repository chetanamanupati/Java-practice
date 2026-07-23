import java.util.HashSet;

public class HashSetContainsDemo {
    public static void main(String[]args){
        HashSet<String> fruits=new HashSet<>();

        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");

        boolean result1=fruits.contains("Apple");
        boolean result2=fruits.contains("Banana");

        System.out.println(result1);
        System.out.println(result2);

    }
    
}
