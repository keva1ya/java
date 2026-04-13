// Kevalya Khandelwal SAP ID-590012117
class Book {
    private String title;
    private double price;
    public void setTitle(String t) {
        title = t;
    }
    public void setPrice(double p) {
        price = p;
    }
    public String getTitle() {
        return title;
    }
    public double getPrice() {
        return price;
    }
}
public class lab4_15 {
    public static void main(String[] args) {
        Book b = new Book();
        b.setTitle("Java Basics");
        b.setPrice(500);

        System.out.println(b.getTitle() + " - " + b.getPrice());
    }
}