package skilllbox5.l1;

public class Lesson1 {
    public static void main(String[] args) {
        // ���� �� ���������� ���������� �������
        // int [] roomCounts = new int[6];
        // ��������� 2 �������� ���������������� �� ��������� 0 (� ����������� �� ���� ������ �������)
        // roomCounts[0] = 5;
        // roomCounts[1] = 45;
        // roomCounts[2] = 34;
        // roomCounts[3] = 28;

        // ������ ������ ���������� �������
        int [] roomCounts = {5, 45, 34, 28};

        for(int i = 0; i < roomCounts.length; i++) {
            System.out.println(roomCounts[i]);
        }

        // ��������� ���� ������ ����� ����� ������� ����� ������������� � ��������� ������ ������ �������
        // String [] colors = {"���������", "�����", "������"};


        String text = "������ ������� ������ �����, ��� ����� �����";

        // ����� split ������������ ��� ���������� �����
        String [] words = text.split(",?\\s+");

        //���� forEach
        for(String longWords: words) {
            System.out.println(longWords);
        }

        System.out.println();
        for(int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }
}
