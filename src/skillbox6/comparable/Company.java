package skillbox6.comparable;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Company {
    public static void main(String[] args) {
        List <Employee> listEmp = new ArrayList<>();
        listEmp.add(new Employee(69, "Oleg"));
        listEmp.add(new Employee(28, "Ivan"));
        Collections.sort(listEmp);
        System.out.println(listEmp);
    }
}


class Employee implements Comparable<Employee> {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int compareTo(Employee emp) {
        return this.name.compareTo(emp.name);
    }

    public String toString() {
        return "{Employee: " + "id: " + id + ", name: " + name + "}";
    }
}