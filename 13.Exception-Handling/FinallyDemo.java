public class FinallyDemo {

    public static void main(String[] args) {

        System.out.println("Program Started");

        try {

            int a = 10;
            int b = 0;

            System.out.println(a / b);

        } catch (ArithmeticException e) {

            System.out.println("Cannot divide by zero");

        } finally {

            System.out.println("Finally Block Executed");

        }

        System.out.println("Program Ended");
    }
}
