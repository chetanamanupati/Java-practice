public class Calculator {
    void add(int a, int b){
        int sum=a+b;
        System.out.println("Sum: "+sum);
    }
    void add(double a, double b){
        double sum=a+b;
        System.out.println("Sum: "+sum);
    }
    void add(int a, int b, int c){
        int sum=a+b+c;
        System.out.println("Sum: "+sum);
    }
    public static void main(String[]args){
       Calculator c1 = new Calculator();
       
        c1.add(10, 20);
        c1.add(10.5, 20.5);
        c1.add(10, 20, 30);
    }
}
