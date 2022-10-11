package zaurpart2.comparable;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

// в массивах тоже самое, при попытке сортировать, только выкинет исключение
public class Test2 {
    public static void main(String[] args) {
        List <Employee> emp = new ArrayList<>();
        Employee emp1 = new Employee(100, "Zaur", "Tregulov", 12345);
        Employee emp2 = new Employee(15, "Ivan", "Petrov", 45643);
        Employee emp3 = new Employee(123, "Ivan", "Sidorov", 34246);
        emp.add(emp1);
        emp.add(emp2);
        emp.add(emp3);
        System.out.println("Before sorting");
        System.out.println(emp);
        Collections.sort(emp);
        System.out.println("After sorting");
        System.out.println(emp);
    }
}

class Employee implements Comparable<Employee> {
    int id;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public int compareTo(Employee anotherEmp) {
/*        if(this.id == anotherEmp.id) return 0;
        else if(this.id < anotherEmp.id) return -1;
        else return 1;*/

        // второй способ
        return this.id - anotherEmp.id;
    }
}