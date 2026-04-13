class Rectangle {
    int length;
    int breadth;
    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;}
    void display() {
        System.out.println("Area of rectangle is: " + length * breadth);
    }
}       
public class FindArea {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(5, 7);
        rect1.display();
    }
}
