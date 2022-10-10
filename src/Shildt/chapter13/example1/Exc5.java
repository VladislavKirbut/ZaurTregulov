package Shildt.chapter13.example1;

public class Exc5 {
    public static void main(String[] args) {
        try {
            int a = args.length;

            int b = 42 / a;

            try {
                if(a == 1) a = a / (a - a); // если нет блока catch во внутреннем try, то перейдёт во внешний

                if(a == 2) {
                    int [] c = {1};
                    c[42] = 99;
                }
            } catch(ArrayIndexOutOfBoundsException e) {
                System.out.println("Индекс за пределами массива " + e);
            }
        } catch(ArithmeticException e) {
            System.out.println("Деление на 0 " + e);
        }
    }
}
