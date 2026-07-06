 class EmployeeThis {
    String name;
    double salary;
    int id;
    String department;

    EmployeeThis(String name,double salary,int id,String department){
        this.name=name;
        this.salary=salary;
        this.id=id;
        this.department=department;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
        System.out.println("ID: "+id);
        System.out.println("Department: "+department);
    }
    public static void main(String[]args){
        EmployeeThis e1= new EmployeeThis("Chetana",50000,102,"CSE");
        EmployeeThis e2= new EmployeeThis("Sravanthi", 56000, 103, "AIML");

        e1.display();
        e2.display();
    }
    
}
