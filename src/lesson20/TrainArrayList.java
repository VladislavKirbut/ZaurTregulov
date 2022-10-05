package lesson20;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TrainArrayList {
    public static void main(String ...args) {

        String str = "Hello, how are you?";
        String str1 = "Hello, how are you?";
        String str3 = "HELLO, HOW are yoU?";

        boolean bool = str.equals(str1);
        System.out.println(bool);
        boolean bool1 = str == str1;
        System.out.println(bool1);

        String str2 = new String("Hello, how are you?");
        boolean bool3 = str.equals(str2);
        System.out.println(bool3);

        // Возвращает символ на указанной позиции
        char symbol = str.charAt(2); // l
        System.out.println(symbol);

        // Сравнивает без учёта регистра
        boolean bool4 = str3.equalsIgnoreCase(str);
        System.out.println(bool4);

        int index = str3.indexOf("HELLO");
        System.out.println(index);
    }
}
