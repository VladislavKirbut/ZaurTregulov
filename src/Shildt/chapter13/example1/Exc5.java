package Shildt.chapter13.example1;

public class Exc5 {
    public static void main(String[] args) {
        try {
            int a = args.length;

            int b = 42 / a;

            try {
                if(a == 1) a = a / (a - a); // ���� ��� ����� catch �� ���������� try, �� ������� �� �������

                if(a == 2) {
                    int [] c = {1};
                    c[42] = 99;
                }
            } catch(ArrayIndexOutOfBoundsException e) {
                System.out.println("������ �� ��������� ������� " + e);
            }
        } catch(ArithmeticException e) {
            System.out.println("������� �� 0 " + e);
        }
    }
}
