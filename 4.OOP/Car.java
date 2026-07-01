public class Car {
    String brand;
    String model;
    double price;

    Car(){
        brand="Toyota";
        model="Fortuner";
        price=4500000;
    }

    void display(){
        System.out.println("Brand: "+brand);
        System.out.println("Model: "+model);
        System.out.println("Price: "+price);
    }

    public static void main(String[]args){
        Car c1=new Car();

        c1.display();
    }
    
}
