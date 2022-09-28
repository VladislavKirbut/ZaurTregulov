package lesson5;

class Employee {
    Employee(int id, String surname, int age, double salary, int department) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    int id;
    String surname;
    int age;
    double salary;
    int department;

    void salaryUp() {
        this.salary *= 2;
        System.out.println("Your salary has doubled.\nSalary: " + this.salary);
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee em1 = new Employee(1, "Ivanov", 23, 2000, 25);
        Employee em2 = new Employee(2, "Stepanov", 36, 2500, 5);
        em1.salaryUp();
        em2.salaryUp();
    }
}
