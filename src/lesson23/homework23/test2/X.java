package lesson23.homework23.test2;

public class X {
    protected void abc() {
        System.out.println('X');
    }
}
//----------------------------------------------------------------------

class Y extends X {
    public void abc() {
        System.out.println('Y');
    }
    public void def() {
        Y y = new Y(); y.abc();
    }
    public void ghi() {
        X x = new Y(); x.abc();
    }

    public static void main(String[] args) {
        Y a = new Y();
        a.abc();
        a.def();
        a.ghi();
    }
}
