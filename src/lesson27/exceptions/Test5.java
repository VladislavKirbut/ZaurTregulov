package lesson27.exceptions;
import java.io.*;

public class Test5 {
    public static void main(String[] args){
        // �������� ������������ ���� � �����
        File f = new File("Test9.txt");
        try {
            // �������� ������ ��� ������
            FileInputStream fis = new FileInputStream(f);
            System.out.println("Good day!");
        }
        // ����� ������ ����������
        catch (FileNotFoundException e) {
            System.out.println("Exception: " + e);
        }
        // ����� ������ ����������
        catch(NullPointerException n) {
            System.out.println("Exception " + n);
        }
        finally {
            System.out.println("This is finally block.");
        }
        System.out.println("This code isn't exception.");
    }
}
