package epam.io;

public class LearnMainThrow {

    public static void main(String[] args) throws IllegalArgumentException{
        int a = 42;
// ���� �� �� ���� ������� if ��� �� ������, ��� ��� ����� throw ���������� ������ �� �����
        if(a <= 0)
            throw new IllegalArgumentException("Side of square is invalid");
        double res = Math.pow(a, 2);
    }
}
