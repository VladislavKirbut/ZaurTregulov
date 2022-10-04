package skillbox6.extendsClasses;

public class Square extends Rectangle {
    public Square(int width) {
        // требует вызова конструктора родительского класса
        super(width, width);
    }

    public void setWidth(int width) {
        this.width = width;
        this.height = width;
    }
    public void setHeight(int width) {
        this.width = width;
        this.height = width;
    }
}
