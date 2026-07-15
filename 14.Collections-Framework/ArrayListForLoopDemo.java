import java.util.ArrayList;

public class ArrayListForLoopDemo{
    public static void main(String[]args){
        ArrayList<String> fruits=new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Banana");

        for(int i=0;i<=3;i++){
            System.out.println(fruits.get(i));
        }
    }
}
