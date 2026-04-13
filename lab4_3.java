// Kevalya Khandelwal SAP ID-590012117
class employee{
    int empid;
    String empname;
    void showdetails(){
        System.out.println("Employee ID: "+empid);
        System.out.println("Employee Name: "+empname);
    }
}
public class lab4_3 {
    public static void main(String[] args) {
        employee emp1 = new employee();
        emp1.empid = 590012117;
        emp1.empname = "Kevalya Khandelwal";
        emp1.showdetails();
        employee emp2 = new employee();
        emp2.empid = 590014925;
        emp2.empname = "kandarp vishal";
        emp2.showdetails();
    }
}
