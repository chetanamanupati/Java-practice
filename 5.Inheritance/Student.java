public class Student extends Person{
    void study(){
        System.out.println("Student is studying");
    }
    public static void main(String[]args){
        Student s1=new Student();

        s1.showName();
        s1.study();
    }
}
