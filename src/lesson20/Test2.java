package lesson20;
import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<StringBuilder> list = new ArrayList<>();
        list.add(new StringBuilder("bye"));
        list.add(new StringBuilder("Hello"));
        list.add(0, new StringBuilder("ok"));
        list.add(1, new StringBuilder("How"));
        for(StringBuilder str: list) {
            System.out.print(str + " ");
        }
        System.out.println();

/*        list.set(0, new StringBuilder("!!!"));*/
/*        list.clear();*/
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
