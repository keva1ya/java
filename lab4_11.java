// Kevalya Khandelwal SAP ID-590012117    
    class Laptop {
    String brand;
    int ram;
    double price;
    Laptop(String brand) {
        this.brand = brand;
    }
    Laptop(String brand, int ram, double price) {
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }
    void display() {
        System.out.println("Brand: " + brand + ", RAM: " + ram + ", Price: " + price);
    }
}
public class lab4_11 {
    public static void main(String[] args) {
        Laptop l1 = new Laptop("Dell");
        Laptop l2 = new Laptop("HP", 16, 75000);
        l1.display();
        l2.display();
    }
}