package Shildt.chapter13.example1;

public class Exc7Throw {
    static void abc() {
        try {
            // ���������� ���������� ����(� �� ����������)
            throw new NullPointerException();
        } catch(NullPointerException e) {
            System.out.println("�������� �������� � ������ abc()");
            // ���������� ���������� ����(� �� ����������)
            throw e;
        }
    }

    public static void main(String[] args) {
        try{
            abc();
        } catch(NullPointerException e) {
            System.out.println("���������� ����������� � ������ main()" + e);
        }
    }
}
