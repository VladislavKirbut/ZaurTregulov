package Lesson7;

public class Employee {
    public double salary;

    public void doubleZP() {
        System.out.println("New salary: " + salary * 2);
    }

    public Employee(double salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        Employee emp = new Employee(500);
        System.out.println(emp.salary);
        emp.doubleZP();
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee emp = new Employee(500);
        System.out.println(emp.salary);
        emp.doubleZP();
    }
}