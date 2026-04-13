// Kevalya Khandelwal SAP ID-590012117
class Laptop {
    private String brand;
    private int ram;
    private double price;

    public void setData(String b, int r, double p) {
        brand = b;
        ram = r;
        price = p;
    }

    public String getBrand() { return brand; }
    public int getRam() { return ram; }
    public double getPrice() { return price; }
}
public class lab4_18 {
    public static void main(String[] args) {
        Laptop l = new Laptop();
        l.setData("Lenovo", 8, 60000);
        System.out.println(l.getBrand() + " " + l.getRam() + " " + l.getPrice());
    }
}