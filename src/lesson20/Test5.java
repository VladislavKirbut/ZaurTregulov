package lesson20;
import java.util.ArrayList;

public class Test5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add(new String("bye"));
        list.add(new String("Hello"));
        list.add(0, new String("ok"));
        list.add(1, new String("How"));

        for(String sb: list) {
            System.out.print(sb + " ");
        }

        System.out.println(list.indexOf("bye"));
        System.out.println();
    }
}
