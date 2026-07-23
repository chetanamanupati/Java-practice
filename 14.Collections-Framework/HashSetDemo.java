import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[]args){
        HashSet<String>fruits=new HashSet<>();

        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("Banana");

        System.out.println(fruits);
    }
    
}
