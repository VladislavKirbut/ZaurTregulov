package Lesson3;

public class Lesson3 {
    public static void main(String[] args) {
/*        boolean x = true;
        boolean y = true;
        boolean z = true;*/

/*        boolean result = x && y && z;
        boolean result1 = x || y || z;

        System.out.println(result);
        System.out.println(result1);*/

        //Short circuit

        boolean bool1 = true;
        boolean bool2 = false;

// Java видит, что операнд false, поэтому не проверяет
// второй операнд и присваивает результат false
        boolean result = bool2 && bool1;

// Java видит, что операнд true, поэтому не проверяет
// второй операнд и присваивает результат true
        boolean result1 = bool1 || bool2;

        System.out.println(result);
        System.out.println(result1);

// Исключающее или вернёт true, когда один (и только) один
// из операндов равен true
        boolean b1 = true;
        boolean b2 = true;
        boolean b3 = true;
        boolean b4 = true;
        System.out.println(b1^b2^b3^b4);
    }
}
