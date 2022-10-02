package epam.strings.using;

import java.util.Arrays;

public class StringMethods {
    public String name;
    public static void main(String[] args) {

        // intern() - интернирование строки
        String str = new String("Hello, world!").intern();
        String str1 = "Hello, world!";
        System.out.println(str == str1);
        System.out.println(str.equals(str1));

        // isEmpty() - выводит true, если строка пустая (пробел - строка не пустая)
        String str2 = new String("");
        System.out.println(str2.isEmpty());

        // isBlank() - выводит true, если строка пустая (пробел и спец. символы - являются пустой строкой)
        String str3 = new String("  \n");
        System.out.println(str3.isBlank());

        // str.strip() - удаляет все пробельные сиволы по краям строки (считается лучшим, чем trim)
        String str4 = "   678    98     ";
        System.out.println(str4.strip());

        // replaceAll - используется для замены символов, соответственно, взяв прошлый пример
        // можно заменить внутренние пробелы, replaceAll использует регулярное выражение
        System.out.println(str4.replaceAll("\\s+", ""));

        String xss = "<script>alert()</script>";
        System.out.println(xss.replaceAll("</?script>", ""));

        // split - вырезает строки по ругулярному выражению
        String str5 = "32664mdsp- sdflk  74927jsd djs3j23b2o 23";
        String [] array = str5.split("\\D+");
        System.out.println(Arrays.toString(array));

        //join - метод соединения строк
        String str6 = String.join(";", "Oleg", "Ivan");
        System.out.println(str6);
    }
}
