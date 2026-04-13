// Kevalya Khandelwal SAP ID-590012117
class Student {
    private int rollNo;
    private String name;

    public void setData(int r, String n) {
        rollNo = r;
        name = n;
    }

    public void display() {
        System.out.println(rollNo + " " + name);
    }
}
public class lab4_13 {
    public static void main(String[] args) {
        Student s = new Student();
        s.setData(1, "Rahul");
        s.display();
    }
}