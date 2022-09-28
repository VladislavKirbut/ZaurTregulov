package SkillboxL6.Extend;

// квадрат
public class Square extends Rectangle {
    public Square(int width) {
        super(width, width);
    }

    @Override
    public void setHeight(int width) {
        this.height = width;
        this.width = width;
    }

    public void setWidth(int width) {
        this.width = width;
        this.height = width;
    }
}

class SquareTest {
    public static void main(String[] args) {
        Square square = new Square(10);
        int s = square.getSquare();
        System.out.println(s);
    }
}
