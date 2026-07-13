public class Addition {
    void add(int a, int b){
        int sum= a+b;
        System.out.println("Sum= "+sum);
    }
    void add(double a, double b){
        double sum=a+b;
        System.out.println("Sum= "+sum);
    }
    public static void main(String[]args){
        Addition a1= new Addition();
        a1.add(10,20);
        a1.add(10.5,20.5);
        
    }
    
}
