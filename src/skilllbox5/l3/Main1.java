package skilllbox5.l3;

public class Main1 {
    public static void main(String[] args) {
        String text = "������ ������� ������ �����, ��� ����� �����";
        String [] colors = text.split(",?\\s+");
        for(int colorIndex = 0; colorIndex < colors.length; colorIndex++) {
            // ���������, ����� ������ �� ���� ���� ������������� ���� (���� ���� ������� ����)
            if (colorIndex > 0 && colors[colorIndex].equals(colors[colorIndex - 1])) {
                continue;
            }
            System.out.println(colors[colorIndex]);
        }
    }
}
