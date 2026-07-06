public class Student {

    String name;
    int marks;

    Student() {
        name = "Chetana";
        marks = 98;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();
    }
}
