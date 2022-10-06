package Shildt.chapter8.example9;

public class A {
    void callme() {
        System.out.println("Method callme() from class A");
    }
}

class B extends A {
    void callme() {
        System.out.println("Method callme() from class B");
    }
}

class C extends A {
    void callme() {
        System.out.println("Method callme() from class C");
    }
}

class Dispatch {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        A r;

        r = a;
        r.callme();

        r = b;
        r.callme();

        r = c;
        r.callme();
    }
}