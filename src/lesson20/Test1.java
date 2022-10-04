package lesson20;
import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        ArrayList <String> list2 = new ArrayList<String>();
        list2.add("Bye");
        ArrayList <StringBuilder> list3 = new ArrayList<>(30);
        List <String> array = new ArrayList<>();

        ArrayList <String> list5 = new ArrayList<>(list2);
        System.out.println(list2 == list5);
    }
}

class Car {}
class Student {}