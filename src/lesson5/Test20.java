package lesson5;

class Test21 {
    int sum(int a, int b, int c) {
        int result = a + b + c;
        return result;
    }

    double averageCount(int a1, int b1, int c1) {
        double result = sum(a1,b1,c1) / 3;
        return result;
    }
}

public class Test20 {
    public static void main(String[] args) {
        Test21 t21 = new Test21();
        int summa = t21.sum(2,10,6);
        System.out.println(summa);
        System.out.println(t21.averageCount(10,30,20));
    }
}
