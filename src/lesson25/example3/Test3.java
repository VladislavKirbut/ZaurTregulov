package lesson25.example3;

public class Test3 {
    public static void main(String[] args) {
        Jumpable j = new Man();
        Man m = new Man();
        Student s = new Student();
        if (j instanceof Jumpable)System.out.println("j is jumpable");
        if (m instanceof Human) System.out.println("m is human");
/*        if (s instanceof Human) System.out.println("s is human");*/
    }
}

interface Jumpable {}
class Human implements Jumpable{}
class Man extends Human {}
class Student {}