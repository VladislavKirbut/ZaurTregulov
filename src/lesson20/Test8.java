package lesson20;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Test8 {
    public static void main(String[] args) {
        ArrayList <String> list1 = new ArrayList<>();
        String s1 = "A";
        String s2 = "B";
        String s3 = "C";
        String s4 = "D";

        Iterator <String> it = list1.iterator();
        // hasNext смотрит дальше есть ли элемент
        while(it.hasNext()) {
            System.out.println(it.hasNext());
        }
    }
}
