package epam.strings.creating;

public class Creating {
    public static void main(String [] args) {
        // 1 ������ �������� ������ (����� ���������������)
        String str = "Hello";
        // 2 ������ �������� ������ (����� �����������)
        String str1 = new String("Hello");
        //3 ������ �������� ������ (�� ������ ������� ��������)
        char[] ch = {'j', 'a', 'v', 'a'};
        String str2 = new String(ch);
        // 4 ������ �������� ������ (�� ������ ������� ����)
        byte[] b = {34, 56, 76, 16, 77};
        String str3 = new String(b);
        System.out.println(str3);
        // 5 ����� (��� ������ ������������ ������ � ������, ������� ���������, null � �.�.)
    }
}
