import java.util.ArrayList;

public class StudentManagement {
    
    ArrayList<Student> students= new ArrayList<>();
 
    public void addStudent(Student student){
        students.add(student);
        System.out.println("Student Added Successfully!");
    }
    
    public void searchStudent(int id){
        for(Student student:students){
            if(student.id==id){
                System.out.println("Student Found!");
                student.displayStudent();
                return;
            }
        }

        System.out.println("Student Not Found!");
    } 

    public void viewStudents(){
        for(Student student: students){
            student.displayStudent();
            System.out.println("------------------");
        }
    }

    public void updateStudent(int id, String newCourse){
        for(Student student:students){
            if(student.id==id){
                student.course= newCourse;
                System.out.println("Student Updated Successfully!");
                return;
            }
        }
        System.out.println("Student Not Found!");
    }   

    public void deleteStudent(int id){
        for(Student student:students){
            if(student.id==id){
                students.remove(student);
                System.out.println("Student Deleted Successfully!");
                return;
            }
        }
        System.out.println("Student Not Found!");
    }

}
