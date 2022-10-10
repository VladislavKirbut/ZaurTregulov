package Shildt.chapter13.example1;

public class Exc2 {
    public static void main(String [] args) {
        int d, a;

        try { //control code
            d = 0;
            a = 42 / d;
            System.out.println("Это не будет выведено");
        }
        catch (ArithmeticException e) {
            //перехватить ошибку деления на 0
            System.out.println("Деление на 0");
        }
        System.out.println("После оператора catch");
    }
}
