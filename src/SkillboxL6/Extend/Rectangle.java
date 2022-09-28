package SkillboxL6.Extend;

// прямоугольник
public class Rectangle {
    public int height;
    public int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return this.height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        return this.width;
    }

    public int getSquare() {
        return this.height * this.width;
    }
}
