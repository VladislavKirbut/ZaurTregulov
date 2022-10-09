package lesson25.example1;

public class Test1 {
    public static void main(String[] args) {
        // Полиморфизм - в зависимости от метода, который вызывает метод work
        // метод work будет работать по разному
        Employee emp1 = new Teacher();
        Employee emp2 = new Driver();
        Employee emp3 = new Doctor();
        Help_able h = new Teacher();
        emp1.help();
        emp1.work();
        emp2.work();
        emp3.work();

        Driver [] arr1 = {new Driver(), new Driver()};
        Employee [] arr2 = {new Teacher(), new Doctor()};
        Help_able [] arr3 = {new Teacher(), new Doctor()};

        Employee [] array1 = {emp1, emp2, emp3};

        for(Employee emp: array1) {
            emp.work();
        }

/*        System.out.println(emp1 instanceof Employee);*/
    }
}

abstract class Employee implements Help_able {
    void sleep() {
        System.out.println("Employee sleeps");
    }
    abstract void work();
}

class Teacher extends Employee implements Help_able {
    void work() {
        System.out.println("Teacher works");
    }
    public void help() {
        System.out.println("Help teacher!");
    }
}

class Driver extends Employee {
    void work() {
        System.out.println("Driver works");
    }

    public void help() {
        System.out.println("Help driver!");
    }
}

class Doctor extends Employee {
    void work() {
        System.out.println("Doctor works");
    }

    public void help() {
        System.out.println("Help doctor!");
    }
}

interface Help_able {
    void help();
}