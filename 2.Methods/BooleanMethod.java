public class BooleanMethod {

    boolean isEven(int n) {

        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {

        BooleanMethod b1 = new BooleanMethod();

        System.out.println(b1.isEven(10));
        System.out.println(b1.isEven(7));

    }
}