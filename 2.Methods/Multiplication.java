public class Multiplication {
    void multiply(int a,int b){
        int product = a*b;
        System.out.println("Product= "+product);
    }
    public static void main(String[]args){
        Multiplication m1 = new Multiplication();
        m1.multiply(5, 4);
        m1.multiply(12, 10);
    }
    
}
