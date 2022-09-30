package sunin.part3.methods;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box();
        box1.length = 5;
        box1.height = 5;
        box1.width = 5;
        box2.length = 10;
        box2.height = 10;
        box2.width = 10;
        System.out.println(box1.showVolume());
        System.out.println(box2.showVolume());
    }
}
