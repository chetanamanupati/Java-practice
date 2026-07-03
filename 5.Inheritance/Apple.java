public class Apple extends Fruit{
    void part(){
        System.out.println("Apple is part of Fruits");
    }
    public static void main(String[]args){
        Apple a1=new Apple();

        a1.colour();
        a1.part();
    
    }
}
