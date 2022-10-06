package lesson23;

public class Test3 {
    public static void main(String[] args) {
        Employee1 emp = new Employee1();
        emp.eat();

        Teacher1 t1 = new Teacher1();
        t1.eat();

        Employee1 e = new Teacher1();
        e.eat();
    }
}

class Food {}
class Fruits extends Food{}
class Employee1 {
    double salary = 100;
    String name = "Kolya";
    int age;
    int experience;

    Food eat() {
        System.out.println("Employee eat");
        return new Food();
    }

    void sleep() {
        System.out.println("Sleep");
    }
}

class Teacher1 extends Employee1 {
    int studentCount;

    Fruits eat() {
        System.out.println("Teacher eat");
        return new Fruits();
    }

    void teach() {
        System.out.println("Teach");
    }
}
