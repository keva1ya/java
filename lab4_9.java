// Kevalya Khandelwal SAP ID-590012117
    class Circle {
    double radius;
    Circle(double r) {
        radius = r;
    }
    void calculate() {
        System.out.println("Area = " + (Math.PI * radius * radius));
        System.out.println("Circumference = " + (2 * Math.PI * radius));
    }
    }
public class lab4_9 {
    public static void main(String[] args) {
        Circle c = new Circle(7);
        c.calculate();
    }    
}
