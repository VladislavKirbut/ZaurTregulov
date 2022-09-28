package lesson12;

public class Car {
    int engine;
    int doorCount;

    Car(int engine, int doorCount) {
        this.engine = engine;
        this.doorCount = doorCount;
    }
}

class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car(3,4);
        Car c2 = new Car(2,5);

        if(c1.engine > c2.engine)
        if(c1.doorCount > c2.doorCount) {
            System.out.println("The engine power and the number of doors of the first car are more");
        }
        else
            System.out.println("Engine power of first car are more, the number of car are less");
        else
            System.out.println("Engine power of first car are more");
    }
}
