abstract class Employee{
    abstract void work();

    void attendance(){
        System.out.println("Employee attendance marked");
    }
}
class SoftwareEngineer extends Employee{
    void work(){
        System.out.println("Software Engineer writes code");
    }
}
class Tester extends Employee{
    void work(){
        System.out.println("Tester tests the application");
    }
}
public class EmployeeDemo{
    public static void main(String[]args){
        Employee e1= new SoftwareEngineer();
        Employee e2= new Tester();

        e1.work();
        e1.attendance();
        System.out.println();
        e2.work();
        e2.attendance();
    }
}