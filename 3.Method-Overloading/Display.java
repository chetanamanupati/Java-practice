
public class Display {

    void show() {
        System.out.println("No Parameters");
    }

    void show(String name) {
        System.out.println("Name: " + name);
    }

    void show(String name, int age) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        Display d1 = new Display();

        d1.show();
        System.out.println();

        d1.show("Chetana");
        System.out.println();

        d1.show("Chetana", 20);

    }
}