package lesson24;

public abstract class Figure {
    int countSides = 0;
    abstract void perimeter();
    abstract void square();
    void showInfo() {
        System.out.println("This is figure.");
    }
}

class Square extends Figure {
    int countSides = 4;
    int side1 = 10;
    void perimeter() {
        System.out.println("Perimeter of square is equal " + side1 * 4);
    }

    void square() {
        System.out.println("Square of square is equal: " + side1 * side1);
    }
}

class Rectangle extends Figure {
    int countSides = 4;
    int side1 = 8;
    int side2 = 5;
    void perimeter() {
        System.out.println("Perimeter of square is equal " + 2 * (side1 + side2));
    }

    void square() {
        System.out.println("Square of square is equal: " + side1 * side2);
    }
}

class Circle extends Figure {
    int countSides = 0;
    int radius = 3;

    void perimeter() {
        System.out.println("Perimeter of square is equal " + 2 * 3.14 * radius);
    }

    void square() {
        System.out.println("Square of square is equal: " + 3.14 * radius * radius);
    }
}
