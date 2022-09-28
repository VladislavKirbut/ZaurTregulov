package Lesson4;

class Student {

    Student(int studentId, String studentName, String studentSurname, int course, double mathAverageMark, double economyAverageMark, double englishAverageMark) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentSurname = studentSurname;
        this.course = course;
        this.mathAverageMark = mathAverageMark;
        this.economyAverageMark = economyAverageMark;
        this.englishAverageMark = englishAverageMark;
    }

    Student(int id, String studentName, String studentSurname, int course) {
        this(id, studentName, studentSurname, course, 0.0, 0.0, 0.0);
    }

    Student() {
        this(1,"Oleg","Ivanov", 1, 0.0,0.0,0.0);
    }
    int studentId;
    String studentName;
    String studentSurname;
    int course;
    double mathAverageMark;
    double economyAverageMark;
    double englishAverageMark;

    double calculateAverageMark(Student student) {
        return (student.economyAverageMark + student.mathAverageMark + student.englishAverageMark) / 3;
    }
}

public class StudentTest {
    public static void main(String[] args) {
        Student st1 = new Student();
        Student st2 = new Student(1, "Ivan", "Ivanov", 3);
        Student st3 = new Student(1,"Oleg", "Ivanov", 2, 9.0, 8.2, 7.64);

        System.out.println("Average mark of first student: " + st1.calculateAverageMark(st1));
        System.out.println("Average mark of second student: " + st2.calculateAverageMark(st2));
        System.out.println("Average mark of third student: " + st3.calculateAverageMark(st3));
    }
}
