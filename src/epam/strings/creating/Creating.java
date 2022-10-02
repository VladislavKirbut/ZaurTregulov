package epam.strings.creating;

public class Creating {
    public static void main(String [] args) {
        // 1 способ создания строки (самый распространённый)
        String str = "Hello";
        // 2 способ создания строки (через конструктор)
        String str1 = new String("Hello");
        //3 способ создания строки (на основе массива символов)
        char[] ch = {'j', 'a', 'v', 'a'};
        String str2 = new String(ch);
        // 4 способ создания строки (на основе массива байт)
        byte[] b = {34, 56, 76, 16, 77};
        String str3 = new String(b);
        System.out.println(str3);
        // 5 спсоб (при помощи конкатенации строки с числом, булевым значением, null и т.д.)
    }
}
