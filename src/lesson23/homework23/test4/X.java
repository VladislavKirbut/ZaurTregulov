package lesson23.homework23.test4;

public class X {}
class Y extends X{}

class Test {
    public static void abc(X x, Y y) {
        System.out.println("Hello");
    }

    public static void abc(Y y, X x) {
        System.out.println("Bye");
    }

    public static void main(String[] args) {
        Y a = new Y();
//        abc(a,a); Error
    }
}
