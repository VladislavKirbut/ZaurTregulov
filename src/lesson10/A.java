package lesson10;
import lesson9.Car; // ������ ������ Car �� ������ lesson9
import lesson9.Student; // ������ ������ Student �� ������ lesson9
/*import lesson9.*;*/ // ������ ���� ������� �� ������ lesson9
import lesson9.homework9.Test1; // ����� ����������

public class A {
    public static void main(String[] args) {
        Car mazda = new Car("Black", "V3");
        lesson9.Student st2 = new lesson9.Student(); // �������� ������� ��� ������� ������
        Student st1 = new Student(); // �������� � �������� ������
    }
}
