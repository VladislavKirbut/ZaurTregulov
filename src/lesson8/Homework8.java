package lesson8;

public class Homework8 {

    public static int caclulateProizv(int a, int b, int c) {
        return a * b * c;
    }

    public static void divisionNum(int a, int b) {
        System.out.println("Integer part: " + a / b);
        System.out.println("Remainder:" + a % b);
    }
}

class HomeworkTest {
    public static void main(String[] args) {
        int result = Homework8.caclulateProizv(2,6, 8);
        System.out.println("Proizvedenie: " + result);
        Homework8.divisionNum(2,10);
        System.out.println();

        int result1 = Homework8.caclulateProizv(1,2,3);
        System.out.println("Proisvedenie 1: " + result1);
        Homework8.divisionNum(20,5);
    }
}