package Shildt.chapter8.example2;

//create superclass
public class A {
    int i = 0;
    private int j; // private values don't can be inherit
}

class B extends A {
    void sum() {
/*        int sum = i + j;*/
        // "j" doesn't visible ERROR
    }

}