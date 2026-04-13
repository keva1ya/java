import java.util.Scanner;

public class lab5 {
    /*  NAME: Kevalya Khandelwal
        SAP ID: 5900112117
        BATCH: 1
    */

    static class AreaCalculator {
        int area(int side) {
            return side * side;
        }

        double area(double length, double breadth) {
            return length * breadth;
        }

        double area(float radius) {
            return 3.14 * radius * radius;
        }
    }

    static class OverloadDemo {
        void display(int firstValue, double secondValue) {
            System.out.println("Method with (int, double): a = " + firstValue + ", b = " + secondValue);
        }

        void display(double firstValue, int secondValue) {
            System.out.println("Method with (double, int): a = " + firstValue + ", b = " + secondValue);
        }
    }

    static class AddOperations {
        int add(int firstValue, int secondValue) {
            return firstValue + secondValue;
        }

        double add(double firstValue, double secondValue) {
            return firstValue + secondValue;
        }

        long add(long firstValue, long secondValue) {
            return firstValue + secondValue;
        }
    }

    static class StudentRecord {
        String name;
        int marks;

        StudentRecord() {
            name = "unknown";
            marks = 0;
        }

        StudentRecord(String name) {
            this.name = name;
            marks = 0;
        }

        StudentRecord(String name, int marks) {
            this.name = name;
            this.marks = marks;
        }

        void display() {
            System.out.println("Student name and marks: name = " + name + ", marks = " + marks);
        }
    }

    static class PromotionDemo {
        void show(int value) {
            System.out.println("Method with int: " + value);
        }

        void show(double value) {
            System.out.println("Method with double: " + value);
        }
    }

    static class SimpleInterestCalculator {
        double calculateSI(double principal, double rate, double time) {
            return (principal * rate * time) / 100;
        }

        double calculateSI(double principal, double rate) {
            double defaultTime = 1;
            return (principal * rate * defaultTime) / 100;
        }
    }

    static class SalaryInfo {
        int total;

        SalaryInfo(int basicSalary) {
            total = basicSalary;
        }

        SalaryInfo(int basicSalary, int bonusAmount) {
            total = basicSalary + bonusAmount;
        }

        void display() {
            System.out.println("Total salary: " + total);
        }
    }

    static class TablePrinter {
        void printTable(int number) {
            for (int multiplier = 1; multiplier <= 10; multiplier++) {
                System.out.println(number + " x " + multiplier + " = " + (number * multiplier));
            }
        }

        void printTable(int number, int range) {
            for (int multiplier = 1; multiplier <= range; multiplier++) {
                System.out.println(number + " x " + multiplier + " = " + (number * multiplier));
            }
        }
    }

    static class TemperatureConverter {
        double convert(double celsius) {
            return (celsius * 9 / 5) + 32;
        }

        double convert(int fahrenheit) {
            return (fahrenheit - 32) * 5 / 9.0;
        }
    }

    static class AdvancedCalculator {
        int subtract(int firstValue, int secondValue) {
            return firstValue - secondValue;
        }

        double subtract(double firstValue, double secondValue) {
            return firstValue - secondValue;
        }

        int multiply(int firstValue, int secondValue) {
            return firstValue * secondValue;
        }

        double multiply(double firstValue, double secondValue) {
            return firstValue * secondValue;
        }

        int divide(int firstValue, int secondValue) {
            return firstValue / secondValue;
        }

        double divide(double firstValue, double secondValue) {
            return firstValue / secondValue;
        }
    }

    public static void main(String[] args) {
        System.out.println("area of different shapes");
        System.out.println();
        AreaCalculator areaCalculator = new AreaCalculator();
        System.out.println("Area of rectangle: " + areaCalculator.area(56, 67));
        System.out.println("Area of square: " + areaCalculator.area(67));
        System.out.println("Area of circle: " + areaCalculator.area(68f));
        System.out.println();

        System.out.println("demonstrate method overloading");
        System.out.println();
        OverloadDemo overloadDemo = new OverloadDemo();
        overloadDemo.display(5, 6.7);
        overloadDemo.display(6.7, 7);
        System.out.println();

        System.out.println("add with method overloading");
        System.out.println();
        AddOperations addOperations = new AddOperations();
        System.out.println("Addition of int: " + addOperations.add(69, 67));
        System.out.println("Addition of double: " + addOperations.add(6.7, 7.6));
        System.out.println("Addition of long: " + addOperations.add(500000000L, 6900000000L));
        System.out.println();

        System.out.println("constructor overloading with student");
        System.out.println();
        StudentRecord defaultStudent = new StudentRecord();
        StudentRecord namedStudent = new StudentRecord("sunny");
        StudentRecord gradedStudent = new StudentRecord("kevalya", 1);
        defaultStudent.display();
        namedStudent.display();
        gradedStudent.display();
        System.out.println();

        System.out.println("promotion");
        System.out.println();
        PromotionDemo promotionDemo = new PromotionDemo();
        promotionDemo.show(5);
        promotionDemo.show(7.2f);
        System.out.println();

        System.out.println("SI");
        System.out.println();
        SimpleInterestCalculator simpleInterestCalculator = new SimpleInterestCalculator();
        System.out.println("SI with 3 parameters: " + simpleInterestCalculator.calculateSI(10000, 5, 6));
        System.out.println("SI with 2 parameters: " + simpleInterestCalculator.calculateSI(6700, 3));
        System.out.println();

        System.out.println("salary with constructor");
        System.out.println();
        SalaryInfo salaryWithoutBonus = new SalaryInfo(50000);
        SalaryInfo salaryWithBonus = new SalaryInfo(60000, 3456);
        salaryWithoutBonus.display();
        salaryWithBonus.display();
        System.out.println();

        System.out.println("table");
        System.out.println();
        TablePrinter tablePrinter = new TablePrinter();
        tablePrinter.printTable(11);

        try (Scanner inputScanner = new Scanner(System.in)) {
            System.out.print("Enter the digit: ");
            int number = inputScanner.nextInt();

            System.out.print("Enter range: ");
            int range = inputScanner.nextInt();

            tablePrinter.printTable(number, range);
        }
        System.out.println();

        System.out.println("temperature");
        System.out.println();
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        System.out.println("Celsius to Fahrenheit: " + temperatureConverter.convert(45.0));
        System.out.println("Fahrenheit to Celsius: " + temperatureConverter.convert(98));
        System.out.println();

        System.out.println("calAdvanced");
        System.out.println();
        AdvancedCalculator advancedCalculator = new AdvancedCalculator();
        System.out.println("Subtraction (int): " + advancedCalculator.subtract(10, 5));
        System.out.println("Subtraction (double): " + advancedCalculator.subtract(10.5, 4.5));
        System.out.println("Multiplication (int): " + advancedCalculator.multiply(6, 3));
        System.out.println("Multiplication (double): " + advancedCalculator.multiply(2.5, 4.0));
        System.out.println("Division (int): " + advancedCalculator.divide(20, 4));
        System.out.println("Division (double): " + advancedCalculator.divide(9.0, 2.0));
    }
}
