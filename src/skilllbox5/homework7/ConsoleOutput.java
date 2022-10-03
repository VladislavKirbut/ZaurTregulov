package skilllbox5.homework7;
import java.util.Scanner;
import java.util.ArrayList;

public class ConsoleOutput {

    public void arrayList() {
        ArrayList <String> arrayList = new ArrayList<>() {{
            add("Washes the dishes.");
            add("Buy flat.");
            add("Go abroad");
            add("Buy car");
        }};
    }
    public static void getCommand(String str) {
        if(str.equals("LIST")) {
            System.out.println("1. Washes the dishes\n" +
                               "2. Buy flat.\n" +
                               "3. Go abroad\n" +
                               "4. Buy car.");
        } else {
            System.out.println("All Commands:\n1. ADD <number> \"What do you want to do\"\n" +
                                              "2. DELETE <number>");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        if (args.length == 0) {
            System.out.println("Starts me with 'COMMANDS' parameter and I show all my commands :))");
            System.out.println("Starts me with 'LIST' parameter and I show you, that I can to do!!!");
        } else if (args.length == 1) {
            if(args[0].equals("COMMANDS")) {
                getCommand("COMMANDS");
            } else if(args[0].equals("LIST")) {
                getCommand("LIST");
            }
        } else if(args.length == 2) {
            int argument2 = Integer.parseInt(args[1]);
                for(int i = 1; i < 10; i++) {
                    if(i == argument2) {
                        System.out.println(i);
                    }
                }
        }
    }
}
