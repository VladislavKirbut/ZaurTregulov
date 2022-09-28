package lesson11.homework11;

public class Car {
    public String color;
    public String engine;
    public int doorCount;

    Car(String color, String engine, int doorCount) {
        this.color = color;
        this.engine = engine;
        this.doorCount = doorCount;
    }
}

class CarTest {

    public static void replaceDoor(Car car, int doorCount) {
        car.doorCount = doorCount;
    }

    public static void replaceColor(Car car1, Car car2) {
        Car car3 = new Car("Pink", "V3", 4);
        car3.color = car1.color;
        car1.color = car2.color;
        car2.color = car3.color;
    }
    public static void main(String[] args) {
        Car car1 = new Car("White", "V6", 3);
        Car car2 = new Car("Black", "V4", 5);

        replaceDoor(car1, 10);
        System.out.println(car1.doorCount);

        replaceColor(car1, car2);
        System.out.println(car1.color);
    }
}
