package Shildt.chapter13.example1;

public class Exc9 {
    static void mA() {
        try{
            System.out.println("Method mA()");
            throw new RuntimeException();
        } finally{
            System.out.println("Finally block in mA method");
        }
    }

    static void mB() {
        try {
            System.out.println("Method mB()");
            return;
        } finally {
            System.out.println("Finally in block mB()");
        }
    }

    static void mC() {
        try{
            System.out.println("Method mC()");
        } finally {
            System.out.println("Finally in method mC()");
        }
    }

    public static void main(String[] args) {
        try {
            mA();
        } catch(Exception e) {
            System.out.println("Исключение перехвачено в методе main " + e);
        }

        mB();
        mC();
    }
}
