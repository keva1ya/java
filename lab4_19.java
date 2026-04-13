// Kevalya Khandelwal SAP ID-590012117
class Car {
    private String carName;
    private double price;

    public void setData(String name, double p) {
        carName = name;
        if (p > 0)
            price = p;
    }

    public String getCarName() { return carName; }
    public double getPrice() { return price; }
}
public class lab4_19 {
    public static void main(String[] args) {
        Car c = new Car();
        c.setData("BMW", 5000000);
        System.out.println(c.getCarName() + " " + c.getPrice());
    }
}