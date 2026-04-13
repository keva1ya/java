// Kevalya Khandelwal SAP ID-590012117
class Rectangle1 {
    double length, breadth;
    Rectangle1(double l, double b) {
        length = l;
        breadth = b;
    }
    void area() {
        System.out.println("Area = " + (length * breadth));

    }
}
public class lab4_6 {
    public static void main(String[] args) {
        Rectangle1 r = new Rectangle1(5, 4);
        r.area();
    }
}

