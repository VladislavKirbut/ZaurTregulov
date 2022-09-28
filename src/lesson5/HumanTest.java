package lesson5;

class Human {
    Human(String name, Car car, BankAccount ba) {
        this.name = name;
        this.car = car;
        this.ba = ba;
    }
    String name;
    Car car;
    BankAccount ba;

    void showInfo() {
        System.out.println("Name: " + name + "\nCar color: " + car.color + "\nCount in bank: " + ba.count);
    }
}

public class HumanTest {
    public static void main(String[] args) {
        Human ivan = new Human("Ivan", new Car("black", "V6"), new BankAccount(1, 2000));
        ivan.showInfo();
    }
}

class Car {
    Car(String color, String engine) {
        this.engine = engine;
        this.color = color;
    }

    String color;
    String engine;
}

class BankAccount {
    BankAccount(int id, int count) {
        this.id = id;
        this.count = count;
    }

    int id;
    int count;
}
