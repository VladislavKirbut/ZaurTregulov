package sunin.part3.oop;

import java.util.Date;
import java.util.Calendar;

public class Student {
    String name;
    int age;
    double weight;

    public static void getAverageAge(Student st1, Student st2, Student st3) {
       double averageAge = (st1.age + st2.age + st3.age) / 3;
        System.out.println("Average age is " + averageAge);
    }

    public static void main(String[] args) {
        Date d = new Date();
        long date = d.getTime();

        System.out.println(date);
        System.out.println(d);
        Student st1 = new Student();
        st1.name = "Vasiliy";
        st1.age = 20;
        st1.weight = 81.6;
        Student st2 = new Student();
        st2.name = "Ivan";
        st2.age = 25;
        st2.weight = 73.6;
        Student st3 = new Student();
        st3.name = "Igor";
        st3.age = 36;
        st3.weight = 86.3;

        getAverageAge(st1, st2, st3);
    }
}
