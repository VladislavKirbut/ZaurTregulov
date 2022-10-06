package lesson23;

public class Test2 {
    public static void main(String[] args) {
        Doctor d = new Doctor();
        Teacher t = new Teacher();
        Driver dr = new Driver();
        Employee e = new Employee();
        Surgeon s = new Surgeon();

        Employee emp1 = new Doctor();
        Employee emp2 = new Teacher();
        Employee emp3 = new Driver();
        Doctor doc = new Surgeon();
        Employee emp4 = new Employee();

        Employee emp5 = new Surgeon();
        emp5.age = 20;
        emp5.sleep();
    }
}

class Employee {
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
// класс хирург
 class Surgeon extends Doctor {
    String scalpel;

    void surgery() {

    }
 }
class Doctor extends Employee {

    // метод лечить
    void toHeal() {
        System.out.println("Heal");
    }

}

 class Teacher extends Employee {
    int studentCount;

    void teach() {
        System.out.println("Teach");
    }
 }

 class Driver extends Employee {
    String nameOfCar;

    void drive() {
        System.out.println("Drive");
    }
 }