package lesson20;
import java.util.ArrayList;
import java.util.Collections;

public class homework20 {
    public static ArrayList<String> abc(String ...str) {
        ArrayList <String> al2 = new ArrayList<>();
        for(String str1: str) {
            if(!al2.contains(str1)) {
                al2.add(str1);
            }
        }
        Collections.sort(al2);
        System.out.println(al2);
        return al2;
    }

    public static void main(String[] args) {
        ArrayList <String> al = new ArrayList<>();
        al = abc("Bye", "Hello");
    }
}
