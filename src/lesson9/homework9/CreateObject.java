package lesson9.homework9;

// ���������� ������� 8 �������� ���, ����� � ��������� ������ ���� �������� ������ 2
public class CreateObject {
    public static void abc() {
        String str1 = new String("ABC"); // ������ ����� ������ � �������� ������ ������
        String str2 = new String("BCD"); // ������ ����� ������ � �������� ������ ������
    }
}

class CreateObjectTest {
    public static void main(String[] args) {
        CreateObject c1 = new CreateObject(); // ������ ������ ������
        CreateObject.abc(); // �������� ����������� �����, 2 ������� ��������� � �� ���������� ������ ��� ������������
        CreateObject.abc(); // �������� ����������� �����, 2 ������� ��������� � �� ���������� ������ ��� ������������
        CreateObject c2 = new CreateObject(); // ������ ������ ������
        CreateObject.abc(); // �������� ����������� �����, 2 ������� ��������� � �� ���������� ������ ��� ������������
    }
}

// ����� ������� � ������ 17 � ��� �������� ������ 2 ��������� �������