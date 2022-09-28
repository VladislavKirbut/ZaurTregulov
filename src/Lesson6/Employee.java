package Lesson6;

public class Employee {

    public Employee(int id, String surname, int age) {
        this(surname, age);
        this.id = id;
    }

    protected Employee(String surname, int age) {
        this.surname = surname;
        this.age = age;
    }

    Employee(int id, String surname, int age, double salary, String department) {
        this(id, surname, age);
        this.salary = salary;
        this.department = department;
    }
    int id;
    public String surname;
    int age;
    private double salary;
    String department;

    public void show(int id) {
        System.out.println("Id: " + id);
    }

    public void show(String surname) {
        System.out.println("Surname: " + surname);
    }

    public void show(double salary) {
        System.out.println("Salary: "+ salary);
    }

}

class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1,"Ivanov", 25);
        System.out.println(emp1.surname);
        Employee emp2 = new Employee("Sidorov", 40);
        System.out.println(emp2.age);
        Employee emp3 = new Employee(1,"Ivanov", 25, 50000, "IT");
        System.out.println(emp3.department);
    }
}