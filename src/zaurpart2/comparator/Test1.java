package zaurpart2.comparator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;

public class Test1 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee(5,"Ivan", "Ivanov", 43);
        Employee emp2 = new Employee(7,"Oleg", "Ivanov", 25);
        Employee emp3 = new Employee(2,"Denis", "Ivanov", 65);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        System.out.println("Before sorting: ");
        System.out.println(list);
        // можно убрать второй параметр и сравнить по Comparable
        Collections.sort(list, new IDComparator());
        System.out.println("After sorting: ");
        System.out.println(list);
    }
}

class Employee implements Comparable<Employee> {
    int id;
    String name;
    String surname;
    int age;

    Employee(int id, String name, String surname, int age) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }

    public int compareTo(Employee emp) {
        if(this.age < emp.age) return -1;
        else if(this.age > emp.age) return 1;
        else return 0;
    }
}
class IDComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        if(emp1.id < emp2.id) return -1;
        else if(emp1.id > emp2.id) return 1;
        else return 0;
    }
}