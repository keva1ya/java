// Kevalya Khandelwal SAP ID-590012117
class BankAccount {
    private double balance;

    public void setBalance(double amount) {
        if (amount > 0)
            balance = amount;
    }

    public double getBalance() {
        return balance;
    }
}
public class lab4_16 {

    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.setBalance(1000);
        System.out.println("Balance: " + b.getBalance());
    }
}