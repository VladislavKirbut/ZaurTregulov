package lesson25.example2;

public class NewClass {
}

class Car{
    static int a = 5 ;

    public static void main(String[] args) {
        Car c = new Car();
        System.out.println(c.a);
        c = null;
        System.out.println(c.a);
    }
}

// ���������� a �� �������� static, � ������ �� �������� � ������
// � ��������� � ������, �������, ����� �� ���������� ������, ����������
// "�" �� ����� ��������� �� "�" (NullPointerException)
class Car1 {
    int a = 5;

    public static void main(String[] args) {
        Car1 c = new Car1();
        System.out.println(c.a);
        c = null;
        System.out.println(c.a);
    }
}