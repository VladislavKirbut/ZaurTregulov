package Shildt.chapter13.example1;

public class Exc3 {
    public static void main(String[] args) {
        try {
            int a = args.length;
            System.out.println("a = " + a);
            int b = 42 / a;
            int [] c = {1};
            c[42] = 99;
        }
        catch(ArithmeticException e) {
            System.out.println("������� �� 0 " + e);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("������ ���������� �� ��������� �������: " + e);
        }
        System.out.println("����� ����� ���������� try/catch");
    }
}