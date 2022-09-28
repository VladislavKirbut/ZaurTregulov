package Lesson4;

public class Student1Test {
    public static void main(String[] args) {
        Student1 st1 = new Student1();
        Student1 st2 = new Student1(1,"Oleg", "Ivanov", 2);
        Student1 st3 = new Student1(1, "Oleg", "Ivanov", 2,8.9, 9.0, 9.1);

        System.out.println("Average mark of first student: " + st1.calculateAverageMark(st1));
        System.out.println("Average mark of second student: " + st2.calculateAverageMark(st2));
        System.out.println("Average mark of third student: " + st3.calculateAverageMark(st3));
    }
}

class Student1 {

    Student1(int studentId, String studentName, String studentSurname, int course) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentSurname = studentSurname;
        this.course = course;
    }

    Student1(int studentId, String studentName, String studentSurname, int course, double mathAverageMark, double economyAverageMark, double englishAverageMark) {
        this(studentId, studentName, studentSurname, course);
        this.mathAverageMark = mathAverageMark;
        this.economyAverageMark = economyAverageMark;
        this.englishAverageMark = englishAverageMark;
    }

    Student1() {
        this(1,"Oleg", "Ivanov", 4, 0.0, 0.0,0.0);
    }
    int studentId;
    String studentName;
    String studentSurname;
    int course;
    double mathAverageMark;
    double economyAverageMark;
    double englishAverageMark;

    double calculateAverageMark(Student1 student) {
        return (student.economyAverageMark + student.mathAverageMark + student.englishAverageMark) / 3;
    }
}
