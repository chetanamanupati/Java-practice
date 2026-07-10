abstract class Shape{
    abstract void draw();
    void message(){
        System.out.println("Drawing shape");
    }
}
class Circle extends Shape{
     void draw(){
        System.out.println("Drawing circle");
     }
}
class Rectangle extends Shape{
    void draw(){
        System.out.println("Drawing Rectangle");
    }
}
public class ShapeDemo{
    public static void main(String[]args){
        Shape s1= new Circle();
        Shape s2= new Rectangle();

        s1.draw();
        s1.message();
        s2.draw();
        s2.message();
    }
}
