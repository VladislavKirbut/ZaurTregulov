package lesson27.exceptions;
// NullPointerException
// ArrayIndexOfBoundsException
// ≈сли мы не будем обрабатывать исключени€, то последующий код выполн€тьс€
// не будет

public class Test2 {
    public static void main(String[] args) {
        int [] array = {11, 5, 0};
        String s = null;
        System.out.println(s.length()); // NullPointerException
/*        System.out.println(array[5]); //ArrayIndexOfBoundsException
        System.out.println("Hello");*/
    }
}
