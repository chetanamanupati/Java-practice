import java.util.HashSet;

public class HashSetIsEmptyDemo {
    public static void main(String[]args){
        HashSet<String> fruits=new HashSet<>();

        System.out.println(fruits.isEmpty());

        fruits.add("Apple");
        fruits.add("Mango");

        System.out.println(fruits.isEmpty());
    }
    
}
