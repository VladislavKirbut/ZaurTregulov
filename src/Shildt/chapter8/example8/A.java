package Shildt.chapter8.example8;

// перешрузка метода выполняется только в том случае, когда имя и сигнатура(параметры) метода одинаковы
public class A {
    int i, j;

    A(int a, int b) {
        i = a;
        j = b;
    }

    void show() {
        System.out.println("i and j: " + i + " " + j);
    }
}

class B extends A {
    int k;
    B(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    //override show method ;
    void show() {
        super.show();
        System.out.println("k: " + k);
    }
}

class Override {
    public static void main(String[] args) {
        B subOb = new B(1,2,3);
        subOb.show();
    }
}
