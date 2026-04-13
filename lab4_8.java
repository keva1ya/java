// Kevalya Khandelwal SAP ID-590012117
class Person {
    String name;
    int age;
    Person(String name) {
        this.name = name;
    }
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    }
public class lab4_8 {
    public static void main(String[] args) {
        Person p1 = new Person("Amit");
        Person p2 = new Person("Riya", 20);
        p1.display();
        p2.display();
    }
}