package lesson8;

public class Homework8_1 {
    private final static double PI = 3.14;
    private double s;
    private static double length;

    public void calculateRadius(double r) {
         s =  PI * Math.pow(r, 2);
    }

    public static void calculateLength(double r) {
         length = 2 * PI * r;
    }

    public void showInfo(double r) {
        System.out.println("Radius r: " + r + "\nSquare S: " + s + "\nLength l: " + length);
    }
}

class Homework8_1Test {
    public static void main(String[] args) {
        Homework8_1 h81 = new Homework8_1();
        h81.calculateRadius(25);
        Homework8_1.calculateLength(25);
        h81.showInfo(25);
    }
}
