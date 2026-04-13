// Kevalya Khandelwal SAP ID-590012117
class Employee {
    private int empId;
    private double salary;

    public void setData(int id, double sal) {
        empId = id;
        if (sal >= 0)
            salary = sal;
    }

    public int getEmpId() {
        return empId;
    }

    public double getSalary() {
        return salary;
    }
}
public class lab4_17 {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setData(101, 50000);
        System.out.println(e.getEmpId() + " " + e.getSalary());
    }
}
