package lesson12.homework12;

class Student {
    public int course;
    public String surname;
    public String name;

    Student(int course, String surname, String name) {
        this.course = course;
        this.surname = surname;
        this.name = name;
    }

    public boolean equals(Student st) {
        return (this.course == st.course && this.surname == st.surname && this.name == st.name);
    }
}
public class StudentTest {

    public static void equalsMethod(Student st1, Student st2) {
        if (st1.equals(st2)) {
            System.out.println("Students are equal.");
        } else {
            System.out.println("Students are not equal.");
        }
    }

    public static void checkStudents(Student st1, Student st2) {
        if(st1.course == st2.course) {
            System.out.println("Students have same course.");
        } else {
            System.out.println("Students don't have same course.");
        }

        if(st1.surname == st2.surname) {
            System.out.println("Students have same surnames.");
        } else {
            System.out.println("Students don't have same surnames.");
        }

        if(st1.name == st2.name) {
            System.out.println("Students have same names.");
        } else {
            System.out.println("Students don't have same names.");
        }
    }

    public static void main(String[] args) {
        Student st1 = new Student(2, "Ivanov", "Igor");
        Student st2 = new Student(2, "Ivanov", "Igor");

        equalsMethod(st1,st2);
        checkStudents(st1,st2);
    }
}
