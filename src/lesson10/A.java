package lesson10;
import lesson9.Car; // импорт класса Car из пакета lesson9
import lesson9.Student; // импорт класса Student из пакета lesson9
/*import lesson9.*;*/ // импорт всех классов из пакета lesson9
import lesson9.homework9.Test1; // мпорт подпакетов

public class A {
    public static void main(String[] args) {
        Car mazda = new Car("Black", "V3");
        lesson9.Student st2 = new lesson9.Student(); // создание объекта без импорта класса
        Student st1 = new Student(); // создание с импортом класса
    }
}
