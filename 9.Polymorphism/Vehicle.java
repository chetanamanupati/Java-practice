public class Vehicle {

    void start() {
        System.out.println("Vehicle is starting");
    }

    public static void main(String[] args) {
        Vehicle v1 = new Car();
        v1.start();
    }
}

class Car extends Vehicle {

    @Override
    void start() {
        System.out.println("Car starts");
    }
}