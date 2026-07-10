abstract class Payment{
    abstract void  pay();

    void receipt(){
        System.out.println("Payment successful");
    }
}
class UPI extends Payment{
    void pay(){
        System.out.println("Payment through UPI");
    }
}
class CreditCard extends Payment{
    void pay(){
        System.out.println("Payment through Credit card");
    }
}
public class PaymentDemo{
    public static void main(String[]args){
        Payment p1= new UPI();
        Payment p2= new CreditCard();

        p1.pay();
        p1.receipt();
        System.out.println();
        p2.pay();
        p2.receipt();
    }
}