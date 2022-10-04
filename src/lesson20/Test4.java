package lesson20;

import java.util.ArrayList;

public class Test4 {
    public static void main(String[] args) {
        ArrayList<StringBuilder> list = new ArrayList<>();
        list.add(new StringBuilder("bye"));
        list.add(new StringBuilder("Hello"));
        list.add(0, new StringBuilder("ok"));
        list.add(1, new StringBuilder("How"));

        for(StringBuilder sb: list) {
            System.out.print(sb + " ");
        }

        //Не найдёт так как мы переаём в indexOf новый объект
        System.out.println(list.indexOf(new StringBuilder("bye")));
    }
}
