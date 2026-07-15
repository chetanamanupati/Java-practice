import java.util.ArrayList;

public class ArrayListClearDemo{
    public static void main(String[]args){
        ArrayList<String> fruits=new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");

        System.out.println(fruits);
        System.out.println();
        fruits.clear();
        System.out.println(fruits);
    }

}
