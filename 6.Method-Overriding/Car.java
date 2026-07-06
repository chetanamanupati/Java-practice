public class Car extends Vehicle {
   @Override
   void start(){
    super.start();

    System.out.println("Car starts with a button");
   } 

   public static void main(String[]args){
    Car c1= new Car();
    c1.start();
   }
}
