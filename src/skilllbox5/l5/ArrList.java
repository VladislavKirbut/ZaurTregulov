package skilllbox5.l5;

import java.util.ArrayList;

public class ArrList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(){{
            add("String");
            add("Integer");
        }};

        // 1 из способов инициализации
        /*arrayList.add("Hello");
        arrayList.add("I'm Vlad!");*/
        arrayList.remove(0);

        for(int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        for(String list: arrayList) {
            System.out.println(list);
        }

        ArrayList <String> arrList = new ArrayList<>(){{
            add("hello");
            add(0, "Vlad");
        }};
        System.out.println(arrList);
    }
}
