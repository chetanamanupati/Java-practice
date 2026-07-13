import java.util.Scanner;

public class IfElseDemo{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
         
        System.out.println("Enter your age: ");
        int age= sc.nextInt();

        if(age>=18){
            System.out.println("Candidate is Eligible to Vote");
        }
        else{
            System.out.println("Candidate is Not Eligible to Vote");
        }
        sc.close();
    }
}
