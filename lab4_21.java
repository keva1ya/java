// Kevalya Khandelwal SAP ID-590012117
class ATM {
    private int pin;

    public void setPin(int pin) {
        this.pin = pin;
    }
    public String getPin() {
        return "****";
    }
}        
public class lab4_21 {
    public static void main(String[] args) {
        ATM a = new ATM();
        a.setPin(1234);
        System.out.println("PIN: " + a.getPin());
    }
}
