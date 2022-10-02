package lesson16;

public class methodsString {

    public static void main(String[] args) {
        String s1 = new String("Hello");

        int a = s1.length(); // выдаёт длину объекта s1(длину символов массива)
        System.out.println(a);

        char c1 = s1.charAt(3); // выводит символ по индексу
        System.out.println(c1);

        int i1 = s1.indexOf("H");
        System.out.println(i1);

        int i2 = s1.indexOf("llo"); // выведет позицию на котором будет найдено первое совпадение
        System.out.println(i2);

        int i3 = s1.indexOf("3"); // -1 (символа нет)
        System.out.println(i3);

        int i4 = s1.indexOf("l", 1); // начиная с первого найти l
        System.out.println(i4);

        boolean b1 = s1.startsWith("H"); // Начинается ли строка с символа H
        System.out.println(b1);

        boolean b2 = s1.startsWith("l", 2);
        System.out.println(b2);

        boolean b3 = s1.endsWith("o");
        System.out.println(b3);

        String s10 = s1.substring(2);
        System.out.println(s10);

        String s11 = s1.substring(2, 4); // возвращает из первой строки символы начиная со 2 по 4 (не включая)
        System.out.println(s11);

        String s12 = s11.trim(); // убирает пробелы по краям строки
        System.out.println(s12);

        String s13 = s1.replace('l', 'd');
        System.out.println(s13);

        String s14 = s1.replace("llo", "dvo");
        System.out.println(s14);

        String s15 = s1.concat(" Vlad"); // метод конкатенации строк
        System.out.println(s15);
    }
}
