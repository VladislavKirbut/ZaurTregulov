package lesson25.example4;

public class Test3 {
    public static void main(String[] args) {
        Employee emp1 = new Doctor();
        Employee emp2 = new Teacher();
        Employee emp3 = new Driver();
        Doctor d1 = (Doctor) emp1;
        Employee e = new Employee();
        System.out.println(d1.specialization);
        System.out.println(emp2 == emp2);
    }
}

class Employee extends Object {
    double salary = 100;
    String name = "Kolya";
    int age;
    int experience;
    void eat() {
        System.out.println("Eat");
    }
    void sleep() {
        System.out.println("Sleep");
    }
}

class Doctor extends Employee {
    String specialization;
    void lechit() {
        System.out.println("Lechit");
    }
}

class Teacher extends Employee {
    int countStudents;
    void teach() {
        System.out.println("Teach");
    }
}

class Driver extends Employee {
    String nameOfCars;
    void drive() {
        System.out.println("Drive!");
    }
}