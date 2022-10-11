package zaurpart2.comparable;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Test3 {
    public static void main(String[] args) {
        List <Car> carList = new ArrayList<>();
        Car car1 = new Car(34, "black", "Audi", 5);
        Car car2 = new Car(25, "white", "BMW", 5);
        Car car3 = new Car(13, "blue", "Mercedes", 5);
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        System.out.println("Before sorting: ");
        System.out.println(carList);
        Collections.sort(carList);
        System.out.println("After sorting: ");
        System.out.println(carList);
    }
}

class Car implements Comparable<Car> {

    Integer id;
    String color;
    String name;
    int countDoors;

    public Car(Integer id, String color, String name, int countDoors) {
        this.id = id;
        this.color = color;
        this.name = name;
        this.countDoors = countDoors;
    }

    // третий вариант, определить id как Integer и вызвать на нём метод, который есть у всех оболочек примитивных типов
    // compareTo
    public int compareTo(Car car) {
        int res = this.id.compareTo(car.id);
        if(res == 0) {
            res = this.color.compareTo(car.color);
        }
        return res;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", countDoors=" + countDoors +
                '}';
    }
}