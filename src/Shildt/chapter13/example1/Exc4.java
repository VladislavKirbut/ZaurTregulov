package Shildt.chapter13.example1;
//��������� ���������
public class Exc4 {
    public static void main(String[] args) {
        int a;
        try {
            a = 0;
            int b = 134 / a;
        }
        catch(Exception e) {
            System.out.println("������� �� 0 " + e);
        }
        // ���� �������� �atch ������ �� ����� ���������, ��� ���
        //ArithmeticException �������� ����������� �� ������ Exception
        // ����� Exception ���������� ��� ������
/*        catch(ArithmeticException e) {
            System.out.println("��� �� ����������");
        }*/
    }
}