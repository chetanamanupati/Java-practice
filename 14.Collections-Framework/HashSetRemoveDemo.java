import java.util.HashSet;

public class HashSetRemoveDemo {
    public static void main(String[]args){
        HashSet<String> fruits=new HashSet<>();

        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Banana");
        
        System.out.println(fruits.remove("Orange"));
        System.out.println(fruits.remove("Grapes"));
        System.out.println(fruits);

    }
    
}
