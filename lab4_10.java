// Kevalya Khandelwal SAP ID-590012117
class Car {
    String carName;
    double price;

    Car(String name, double price) {
        carName = name;
        this.price = price;
    }

    void display() {
        System.out.println(carName + " - " + price);
    }
}
public class lab4_10 {

    public static void main(String[] args) {
        Car c1 = new Car("Honda", 800000);
        Car c2 = new Car("Hyundai", 900000);

        c1.display();
        c2.display();
    }
}