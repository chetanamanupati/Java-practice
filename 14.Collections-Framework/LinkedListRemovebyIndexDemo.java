import java.util.LinkedList;

public class LinkedListRemovebyIndexDemo{
    public static void main(String[]args){
        LinkedList<String> fruits= new LinkedList<>();

        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Banana");

        fruits.remove(1);

        System.out.println(fruits);
    }
}

