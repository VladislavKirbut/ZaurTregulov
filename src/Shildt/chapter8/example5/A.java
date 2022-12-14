package Shildt.chapter8.example5;

public class A {
    int i;
}

class B extends A {
    int i;
    B(int a, int b) {
        super.i = a;
        i = b;
    }

    void show() {
        System.out.println("Superclass has i: " + super.i);
        System.out.println("Subclass has i: " + i);
    }
}

class UseSuper {
    public static void main(String[] args) {
        B subOb = new B(1,2);
        subOb.show();
    }
}
