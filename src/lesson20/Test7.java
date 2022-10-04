package lesson20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test7 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        ArrayList<StringBuilder> list1 = new ArrayList<>();
        list1.add(sb1);
        list1.add(sb2);
        list1.add(sb3);
        Object [] array1 = list1.toArray();
        for(Object o: array1) {
            System.out.println(o);
        }

        StringBuilder [] array = {sb2,sb3,sb3,sb3};
        List<StringBuilder> list8 = Arrays.asList(array);
        System.out.println(list8);
    }
}
