import java.util.LinkedList;

public class LinkedListForLoopDemo{
    public static void main(String[]args){
        LinkedList<String> fruits= new LinkedList<>();

        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Banana");

        for(int i=0;i<fruits.size();i++){
            System.out.println(fruits.get(i));    
        }
    }
}
