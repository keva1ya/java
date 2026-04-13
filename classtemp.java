interface laptop
{
    void turnon();
    void turnoff();
    void runsoftware();
}
class lenovo implements laptop
{
    public void turnon()
    {
        System.out.println("Lenovo laptop is turned on.");
    }
    public void turnoff()
    {
        System.out.println("Lenovo laptop is turned off.");
    }
    public void runsoftware()
    {
        System.out.println("Lenovo laptop is running software.");
    }
}
public class classtemp {
    public static void main(String[] args) {
        lenovo myLaptop = new lenovo();
        myLaptop.turnon();
        myLaptop.runsoftware();
        myLaptop.turnoff();
    }
}