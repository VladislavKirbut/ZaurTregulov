package lesson27.exceptions;

public class Test4 {
    public static void main(String[] args) {
        // � ������ ������� exception �� ����� ����� ����, ��� ��� ������ ��������
        // � �� � ���� ����� ���������, ������ ������ � Test5, ��� ����� ��������� ��������� ������
        int[] array = {4, 8, 1};
        System.out.println("We have array.");
        try {
            System.out.println(array[5]);
            System.out.println("Good day.");
        }
        // ArrayIndexOfBoundsException e - ��� ��� �������� (e - �������� Exception)
        // ����� �� ������ � ���� ����������
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Bil poiman exception");
        }
        finally {
            System.out.println("This is finally block");
        }

        System.out.println("This code isn't exception.");
    }
}
