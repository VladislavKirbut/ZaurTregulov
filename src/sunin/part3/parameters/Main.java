package sunin.part3.parameters;

public class Main {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle();

        rect1.setParameters(20.0,39.5);
        rect2.setParameters(15, 25);

        double perimeter1 = rect1.getPerimeter();
        double perimeter2 = rect2.getPerimeter();

        double square1 = rect1.getSquare();
        double square2 = rect2.getSquare();

        System.out.println("Perimeter of first rectangle: " + perimeter1);
        System.out.println("Perimeter of second rectangle: " + perimeter2);
        System.out.println("Square of first rectangle: " + square1);
        System.out.println("Perimeter of second rectangle: " + square2);
    }
}
