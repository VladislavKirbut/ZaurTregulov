package Lesson6;

public class Homework1 {
    void sum() {
        System.out.println("Sum is: " + 0);
    }

    void sum(int a) {
        System.out.println("Sum is: " + a);
    }

    void sum(int a, int b) {
        int result = a + b;
        System.out.println("Sum is: " + result);
    }

    void sum(int a, int b, int c) {
        int result = a + b + c;
        System.out.println("Sum is: " + result);
    }

    void sum(int a, int b, int c, int d) {
        int result = a + b + c + d;
        System.out.println("Sum is: " + result);
    }
}

class Homework1Test {
    public static void main(String[] args) {
        Homework1 hw1 = new Homework1();
        hw1.sum();
        hw1.sum(1);
        hw1.sum(5,6);
        hw1.sum(10,10,10);
        hw1.sum(1,5,4,5);
    }
}