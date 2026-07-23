import java.util.HashSet;

public class HashSetForEachDemo {
    public static void main(String[]args){
        HashSet<String> fruits= new HashSet<>();

        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Banana");

        for(String fruit: fruits){
            System.out.println(fruit);
        }
    }
    
}
