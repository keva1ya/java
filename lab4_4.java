// Kevalya Khandelwal SAP ID-590012117
class employee{
    int empid;
    String empname;
    employee(int empid, String empname){
        this.empid = empid;
        this.empname = empname;
    }
    void display(){
        System.out.println("Employee ID: "+empid);
        System.out.println("Employee Name: "+empname);
    }
}
public class lab4_4 {
    public static void main(String[] args) {
        employee emp1 = new employee(590012117, "Kevalya Khandelwal");
        employee emp2 = new employee(590014925, "kandarp vishal");
        emp1.display();
        emp2.display();
    }
}