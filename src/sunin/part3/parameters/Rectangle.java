package sunin.part3.parameters;

public class Rectangle {
    double length;
    double width;

    public void setParameters(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getPerimeter() {
        return (length + width) * 2;
    }

    public double getSquare() {
        return length * width;
    }
}
