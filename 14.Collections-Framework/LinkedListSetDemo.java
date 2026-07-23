import java.util.LinkedList;

public class LinkedListSetDemo{
    public static void main(String[]args){

        LinkedList<String>fruits= new LinkedList<>();

        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");

        fruits.set(1,"Banana");
        System.out.println(fruits);
    }
}
