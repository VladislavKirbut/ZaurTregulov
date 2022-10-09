package Shildt.chapter8.example11;

abstract class A {
    abstract void callme();

    void callmetoo() {
        System.out.println("This is method!");
    }
}

class B extends A {
    void callme() {
        System.out.println("callme() in class B");
    }
}

class AbstractDemo {
    public static void main(String[] args) {
        B b = new B();
        b.callme();
        b.callmetoo();
    }
}