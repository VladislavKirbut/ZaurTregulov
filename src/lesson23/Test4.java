package lesson23;

public class Test4 {
    void abc(Animal1 a) {
        System.out.println("A");
    }

    void abc(Mouse1 m) {
        System.out.println("M");
    }

    public static void main(String[] args) {
        Test4 t4 = new Test4();
        Animal1 an = new Mouse1(); // defined compile time binding (�.�. ����� ������� ��� an ���� Animal � ���������� ������ ����� abc)
        t4.abc(an); // defined run time binding (��� ��� �� ����������� �� ������� ����� � ������ ������� ���������)
    }
}
class Animal1 {
    void getName() {
        System.out.println("Animal");
    }
}

class Mouse1 extends Animal1{
    void getName() {
        System.out.println("Mouse");
    }
}
