package Shildt.chapter13.example1;

public class Exc2 {
    public static void main(String [] args) {
        int d, a;

        try { //control code
            d = 0;
            a = 42 / d;
            System.out.println("��� �� ����� ��������");
        }
        catch (ArithmeticException e) {
            //����������� ������ ������� �� 0
            System.out.println("������� �� 0");
        }
        System.out.println("����� ��������� catch");
    }
}
