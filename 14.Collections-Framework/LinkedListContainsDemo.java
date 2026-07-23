import java.util.LinkedList;

public class LinkedListContainsDemo{
    public static void main(String[]args){
        LinkedList<String> fruits= new LinkedList<>();

        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Banana");

        System.out.println(fruits.contains("Mango"));
        System.out.println(fruits.contains("Pineapple"));
    }
}