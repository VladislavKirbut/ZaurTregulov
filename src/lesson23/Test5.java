package lesson23;

public class Test5 {
    public static void main(String[] args) {

    }
}

class Employee2 {
    double salary = 100;
    String name = "Kolya";
    int age;
    int experience;

    void eat() {
        System.out.println("Employee eat");
    }

    void sleep() {
        System.out.println("Sleep");
    }
}

class Teacher2 extends Employee2 {
    int studentCount;

    void eat() {
        System.out.println("Teacher eat");
    }

    void teach() {
        System.out.println("Teach");
    }
}