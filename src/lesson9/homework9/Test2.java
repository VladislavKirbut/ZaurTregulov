package lesson9.homework9;

public class Test2 {
    int a = 1;
    static int b = 2;
    void abc(int a) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(this.a);
        System.out.println(Test2.b);
    }

    public static void main(String[] args) {
        Test2 t = new Test2();
        t.abc(4);
    }
}
