public class Laptop {
    String brand;
    String processor;
    int ram;
    double price;

    Laptop(){
        brand="Dell";
        processor="Intel i7";
        ram=16;
        price=75000;
    }

    void display(){
        System.out.println("Brand: "+brand);
        System.out.println("Processor: "+processor);
        System.out.println("Ram: "+ram);
        System.out.println("Price: "+price);
    }

    public static void main(String[]args){
        Laptop l1=new Laptop();

        l1.display();
    }
}
