package Shildt.chapter8.example7;

public class A {
    A() {
        System.out.println("In constructor A");
    }
}

class B extends A {
    B() {
        System.out.println("In constructor B");
    }
}

class C extends B {
    C() {
        System.out.println("In constructor C");
    }
}

class CollingCons {
    public static void main(String[] args) {
        C c = new C();
    }
}