package Shildt.chapter8.example1;
//Simple inheritance
// create superclass
public class A {
    int i, j;
    void showij() {
        System.out.println("i and j: " + i + " " + j);
    }
}

//create subclass
class B extends A {
    int k;

    void showk() {
        System.out.println("k : " + k);
    }

    void sum() {
        System.out.println("i+j+k: " + (i + j + k));
    }
}

class SimpleInheritance {
    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B();

        //superclass
        superOb.j = 10;
        superOb.i = 20;
        System.out.println("superOb: ");
        superOb.showij();
        System.out.println();

        //subclass
        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        System.out.println("subOb: ");
        subOb.showij();
        subOb.showk();

        System.out.println();
        System.out.println("The sum of i, j, and k in object subOb: ");
        subOb.sum();
    }
}
