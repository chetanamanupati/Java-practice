import java.util.LinkedList;

public class LinkedListGetDemo{
    public static void main(String[]args){
        LinkedList<String> fruits=new LinkedList<>();
        
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Banana");

        System.out.println(fruits.get(2));
    }
}
