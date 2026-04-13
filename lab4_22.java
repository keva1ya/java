// Kevalya Khandelwal SAP ID-590012117
class StudentMarks {
    private int marks;
    public void setMarks(int m) {
        if (m >= 0 && m <= 100)
            marks = m;
    }
    public int getMarks() {
        return marks;
    }
}
public class lab4_22 {
    public static void main(String[] args) {
        StudentMarks s = new StudentMarks();
        s.setMarks(85);
        System.out.println("Marks: " + s.getMarks());
    }
}