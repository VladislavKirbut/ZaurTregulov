package lesson27.exceptions;
import java.io.*;
public class Test3 {
    public static void main(String[] args) throws Exception {
        File f = new File("test10.txt");
        // ����� ������������ ��� ������ ��������� ���������� �� ����� ���� ��� ���,
        // ���� ���, �� �� �������� ���������� FileNotFoundException.
        FileInputStream  fis = new FileInputStream(f);
        fis.read();
        // ���� �����, ����������� ���������, ���� �� ����� ���� ��� ���, ���� ���
        // �� ����������� �������� ���������� FileNotFoundException.
        FileOutputStream fos = new FileOutputStream(f);
        fos.write(100);
    }
}
