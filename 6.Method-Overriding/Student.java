public class Student extends Person{
    @Override

    void action(){
        super.action();

        System.out.println("Student is studying");
    }
    public static void main(String[]args){
        Student s1= new Student();

        s1.action();
    }
    
}
