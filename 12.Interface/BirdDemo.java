interface Flyable{
    void fly();
}
interface Walkable{
    void walk();
}
class Bird implements Flyable, Walkable{
    public void fly(){
        System.out.println("Bird can fly");
    }
    public void walk(){
        System.out.println("Bird can walk");
    }
}   
 public class BirdDemo{
    public static void main(String[]args){

        Flyable f= new Bird();
        f.fly();
        System.out.println();
        Walkable w= new Bird();
        w.walk();
    }
 }
