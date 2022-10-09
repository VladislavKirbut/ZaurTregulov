package lesson24;

import java.util.Calendar;

public class Test3 {
    public static void main(String[] args) {
        Help_able h = new Driver();
        System.out.println(h.Z);
    }
}

class Employee {
    double salary = 100;
    String name = "Kolya";
    int age;
    int experience;
    void eat() {
        System.out.println("Eat");
    }
    void sleep() {
        System.out.println("Sleep");
    }
}

class Teacher extends Employee implements Help_able {
    int studentCount;
    void teach() {
        System.out.println("Teach");
    }
    public void firstHelp() {
        System.out.println("Help");
    }
    public void tushitPozhar() {
        System.out.println("Pozhar");
    }
}

class Driver extends Employee implements Help_able, swim_able {
    String nameOfCar;
    void drive() {
        System.out.println("Drive");
    }
    public void firstHelp() {
        System.out.println("Help");
    }
    public void tushitPozhar() {
        System.out.println("Pozhar");
    }
    public void swim() {
        System.out.println("swim");
    }
}


interface Help_able {
    public static final int  Z = 10;
    //abstract methods (all)
    void firstHelp();
    void tushitPozhar();
}

interface swim_able {
    //abstract method
    void swim();
}
