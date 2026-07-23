import java.util.HashSet;

public class HashSetAddDemo {
    public static void main(String[]args){
        HashSet<String> fruits= new HashSet<>();

        boolean result1=fruits.add("Apple");
        boolean result2=fruits.add("Mango");
        boolean result3=fruits.add("Apple");

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

        System.out.println(fruits);
    }
    
}
