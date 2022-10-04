package lesson20;
import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {
        ArrayList <StringBuilder> list = new ArrayList<>();
        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("Ok");
        StringBuilder sb3 = new StringBuilder("Bye");
        list.add(sb1);
        list.add(sb2);
        list.add(sb3);
        for(int i = 0; i < list.size(); i++) {
            list.get(i).append("!!!");
        }
        list.remove(2); // удаление элемента по индексу
        list.add(sb1);

        list.remove(sb1); // удаление по имени объекта
        ArrayList <String> list2 = new ArrayList<>();
        list2.add("Petrov");
        list2.add("Sidorov");
        list2.addAll(0, list2);
        for(String sb: list2) {
            System.out.print(sb + " ");
        }
    }
}
