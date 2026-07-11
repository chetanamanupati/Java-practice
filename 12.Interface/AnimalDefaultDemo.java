interface Animal{
    void sound();

    default void eat(){
        System.out.println("Animal is eating");
    }
}
class Dog implements Animal{
    public void sound(){
        System.out.println("Dog barks");
    }
}
public class AnimalDefaultDemo{
    public static void main(String[]args){
        Animal a= new Dog();

        a.sound();
        a.eat();
    }
}