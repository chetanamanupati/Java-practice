abstract class Vehicle{
   abstract void start();

    void stop(){
        System.out.println("Vehicle stopped");
    }
}
  class Car extends Vehicle{
    void start(){
        System.out.println("Car started");
    }
}
public class Demo{
public static void main(String[]args){
    
        Vehicle v1= new Car();

        v1.start();
        v1.stop();
    }
}
