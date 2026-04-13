// Kevalya Khandelwal SAP ID-590012117
class Mobile {
    private String model;
    private double price;
    Mobile(String m, double p) {
        model = m;
        price = p;
    }
    public String getModel() {
        return model;
    }
    public double getPrice() {
        return price;
    }
}
public class lab4_23 {
    public static void main(String[] args) {
        Mobile m = new Mobile("Samsung", 20000);
        System.out.println(m.getModel() + " " + m.getPrice());
    }
}