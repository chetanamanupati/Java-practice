import java.util.LinkedList;

public class LinkedListRemovebyValueDemo{
    public static void main(String[]args){
        LinkedList<String> fruits= new LinkedList<>();

        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Banana");

        fruits.remove("Orange");

        System.out.println(fruits);

    }
}