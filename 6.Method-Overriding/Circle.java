public class Circle extends Shape {
    @Override

    void draw(){
        super.draw();

        System.out.println("Drawing circle");
    }
    public static void main(String[]args){
        Circle c1= new Circle();
        c1.draw();
    }
    
}
