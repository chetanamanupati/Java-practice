public class BankAccount {

    private double balance;

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid Balance");
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {

        BankAccount b1 = new BankAccount();

        b1.setBalance(5000);
        System.out.println("Balance: " + b1.getBalance());

        b1.setBalance(-1000);
        System.out.println("Balance: " + b1.getBalance());
    }
}