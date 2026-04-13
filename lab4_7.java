// Kevalya Khandelwal SAP ID-590012117
class BankAccount {
    int accountNumber;
    double balance;
    BankAccount(int acc, double bal) {
        accountNumber = acc;
        balance = bal;
    }
    void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}
public class lab4_7 {
    public static void main(String[] args) {
        BankAccount b = new BankAccount(12345, 5000);
        b.displayBalance();
    }
}    

