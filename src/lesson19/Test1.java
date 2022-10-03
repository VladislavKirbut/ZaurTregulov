package lesson19;

public class Test1 {
    public static int summa;
    public static void summa(int ...a) {
        for(int i = 0; i < a.length; i++) {
            summa += a[i];
        }
        System.out.println(summa);
    }
    public static void main(String[] args) {
        summa(5,7,3,6);
    }
}
