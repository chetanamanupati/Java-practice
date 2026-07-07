public class Shape{
    void draw(){
        System.out.println("draw a shape");
    }
    public static void main(String[]args){
        Shape s= new Circle();
        s.draw();
    }
}
    class Circle extends Shape{
        void draw(){
            System.out.println("Circle is drawn");
        }
    }
