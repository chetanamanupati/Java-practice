public class CalculatorDemo {
    public static void main(String[]args){
        System.out.println("Calculator Started");
    try{
        int a=20;
        int b=0;

        System.out.println(a/b);
    }
    catch(ArithmeticException e){
        System.out.println("Cannot divide by zero");
    }
    finally{
        System.out.println("Thank you for using Calculator");
    }
    System.out.println("Calculator Ended");
}
}