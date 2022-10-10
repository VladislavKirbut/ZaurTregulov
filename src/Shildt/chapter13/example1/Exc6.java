package Shildt.chapter13.example1;

public class Exc6 {
    static void nesstry(int a) {
        try{
            if(a == 1) a = a / (a - a);

            if(a == 2) {
                int [] c = {1};
                c[42] = 99;
            }
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Индекс за пределами массива " + e);
        }
    }

    public static void main(String[] args) {
        try{
            int a = args.length;

            int b = 42 / a;
            nesstry(a);
        } catch(ArithmeticException e) {
            System.out.println("Деление на 0 " + e);
        }
    }
}
