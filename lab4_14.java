// Kevalya Khandelwal SAP ID-590012117
    class Person {
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
public class lab4_14 {
    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(25);
        System.out.println("Age: " + p.getAge());
    }
}