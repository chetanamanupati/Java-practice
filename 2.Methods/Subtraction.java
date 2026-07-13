public class Subtraction {
    void subtract(int a, int b){
        int difference = a-b;
        System.out.println("Difference = "+difference);
    }
    public static void main(String[]args){
        Subtraction s1= new Subtraction();

        s1.subtract(50,10);
        s1.subtract(100,80);

    }    
}
