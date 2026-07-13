public class Calculator {
    void add(int a, int b){
        int sum= a+b;
        System.out.println("Sum= "+sum);
    }
    void subtract(int a, int b){
        int subtract=a-b;
        System.out.println("Difference= "+subtract);
    }
    void multiply(int a, int b){
        int product=a*b;
        System.out.println("Product= "+product);
    }
    void divide(int a, int b){
        int quotient=a/b;
        System.out.println("Quotient= "+quotient);
    }
    public static void main(String[]args){
        Calculator c1 = new Calculator();

        c1.add(10,20);
        c1.subtract(30,10);
        c1.multiply(5,6);
        c1.divide(20,5);
    }
    
}
