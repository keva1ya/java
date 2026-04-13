// Kevalya Khandelwal SAP ID-590012117
class Student{
        int rollno;
        String name;
        void display(){
            System.out.println("Student name: " + name);
            System.out.println("Student roll number: " + rollno);
        }
    }
public class lab4_1 {
    public static void main(String[] args) {
        Student st = new Student();
        st.name = "Kevalya Khandelwal";
        st.rollno = 590012117;
        st.display();
    }
    
}
