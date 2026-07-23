import java.util.LinkedList;

public class LinkedListForEachLoopDemo {
    public static void main(String[]args){
        LinkedList<String> fruits=new LinkedList<>();

        fruits.add("Apple");
        fruits.add("mango");
        fruits.add("Orange");
        fruits.add("Banana");

        for(String fruit : fruits){
            System.out.println(fruit);
        }
    }
}
