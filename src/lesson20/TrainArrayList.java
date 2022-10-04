package lesson20;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TrainArrayList {
    public static void main(String ...args) {
        ArrayList<String> array = new ArrayList<>() {{
            add("JAVA");
            add(0, "HTML");
            add(1, "JS");
            add("Spring");
            add("SQL");
        }};
        Collections.sort(array);
        System.out.println(array);
        array.set(array.size() - 1, "PostegreSQL");
        System.out.println(array);
        array.remove(1);
        System.out.println(array);
        array.clear();
        System.out.println(array);

    }
}
