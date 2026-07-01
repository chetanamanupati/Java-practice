public class Employee {
    String name;
    int id;
    double salary;
    String department;

    Employee() {
        name = "Chetana";
        id = 101;
        salary = 50000;
        department = "CSE";
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.display();
    }
}
