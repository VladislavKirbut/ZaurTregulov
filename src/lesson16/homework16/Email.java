package lesson16.homework16;
public class Email {
    int a = 0;
    int b = 0;
    int c = 0;

    public void email(String str) {
        while(c < str.length() - 1) {
            a = str.indexOf("@", c);
            b = str.indexOf('.', c);
            c = str.indexOf(';', c + 1);

            System.out.println(str.substring(a + 1, b));
        }
    }

    public static void main(String[] args) {
        Email email1 = new Email();
        email1.email("ya@yahoo.com; on@mail.ru; ona@gmail.com;");
    }
}