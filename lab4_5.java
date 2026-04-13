// Kevalya Khandelwal SAP ID-590012117
class Student1 {
    int rollNo;
    String name;
    Student1(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }
}
public class lab4_5 {
    public static void main(String[] args) {
        Student1 s1 = new Student1(21, "bruhman");
        s1.display();
    }
}

