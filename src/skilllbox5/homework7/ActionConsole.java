package skilllbox5.homework7;
import java.util.ArrayList;
import java.util.Arrays;

public class ActionConsole {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        if (args.length == 1) {
            if (args[0].equals("LIST")) {
                for (int i = 0; i < list.size(); i++) {
                    System.out.println((i + 1) + " " + list.get(i));
                }
            }
            int index1 = args[0].indexOf(" ");
            String str = args[0].substring(0, index1);
            System.out.println(str);
            if(str.equals("DELETE")) {
                int index = Integer.parseInt(args[0].substring(index1 + 1, index1 + 2));
                list.remove(index);
                System.out.println("You remove " + index + " line");
            }
        } else {
            System.out.println("Enter correct parameter.");
        }
    }
}
