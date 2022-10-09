package lesson23.homework23.test5;

public class X {
    String s1 = "Hello";
}

class Y extends X {
    boolean bool = false;
}

class Test {
    public static void main(String[] args) {
        X x = new Y();
//        System.out.println(x.s1 + " " + x.bool); ERROR
    }
}