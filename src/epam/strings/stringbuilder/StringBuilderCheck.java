package epam.strings.stringbuilder;

public class StringBuilderCheck {
        public static void main(String[] args) {
                // ����� ������ ������ �� ����� �������� ����� ����� (������ ������)
                StringBuilder strBuilder = new StringBuilder("");
                System.out.println(strBuilder.capacity());
                strBuilder.append("Vlad");
                System.out.println(strBuilder.length()); // ��������� ������ ������
                System.out.println(strBuilder.capacity()); // ��������� ������ ������
                System.out.println(strBuilder);
        }
}
