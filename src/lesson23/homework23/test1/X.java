package lesson23.homework23.test1;
// Какой будет результат компиляции и запуска класса Y?
public class X {
    X() {}

    public void abc() {
        System.out.println('X');
    }
}
//-----------------------------------------------------------------------

class Y extends X {
    Y() {}
    public void abc() {
        System.out.println('Y');
    }

    public static void main(String[] args) {
        Y y = new Y();
        y.abc();
    }
}