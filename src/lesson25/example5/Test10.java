package lesson25.example5;

public class Test10 {
    int a = 5;
    void abc() {
        System.out.println("Ok1");
    }
}

class Test20 extends Test10 {
    //hiding (compile time binding)
    int a = 10;
    void abc() {
        System.out.println("Ok2");
    }
}

class Test30 extends Test20 {
    int a = 15;
    void abc() {
        System.out.println("Ok3");
    }

    public static void main(String[] args) {
        Test30 t = new Test30();
        System.out.println(((Test10)t).a);
        ((Test20)t).abc();
    }
}
