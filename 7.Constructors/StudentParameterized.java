public class StudentParameterized {
    String name;
    int age;

    StudentParameterized(String n,int a){
        name=n;
        age=a;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
    public static void main(String[]args){
        StudentParameterized s1= new StudentParameterized("Chetana",20);
        StudentParameterized s2= new StudentParameterized( "Mahi",23);

        s1.display();
        System.out.println();
        s2.display();
    }


}
