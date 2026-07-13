public class ReturnMethod {

    int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {

        ReturnMethod r1 = new ReturnMethod();

        int result = r1.add(10, 20);

        System.out.println("Sum = " + result);

    }
}
