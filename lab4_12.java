// Kevalya Khandelwal SAP ID-590012117
class Student {
    int rollNo;
    String name;

    Student(int r, String n) {
        rollNo = r;
        name = n;
    }
    void display() {
        System.out.println(rollNo + " " + name);
    }
    }
public class lab4_12 {
    public static void main(String[] args) {
        Student[] s = new Student[3];

        s[0] = new Student(1, "A");
        s[1] = new Student(2, "B");
        s[2] = new Student(3, "C");

        for (int i = 0; i < 3; i++) {
            s[i].display();
        }
    }
}
