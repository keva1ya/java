// Kevalya Khandelwal SAP ID-590012117
class book{
    String title;
    double price;
    void display(){
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
    }
}
public class lab4_2 {
    public static void main(String[] args) {
        book book1 = new book();
        book1.title = "Java Programming";
        book1.price = 0.0;
        book1.display();
    }      
}
