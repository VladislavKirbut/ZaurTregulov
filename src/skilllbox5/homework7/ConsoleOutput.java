package skilllbox5.homework7;
import java.util.ArrayList;

public class ConsoleOutput {

    static ArrayList<String> arraylist;
    public static StringBuilder strBuild = new StringBuilder("");
    public static void list(int index, String str, String action) {
        arraylist = new ArrayList<>() {{
            add("Washes the dishes.");
            add("Buy flat.");
            add("Go abroad");
            add("Buy car");
        }};

        if (action.equals("DELETE")) {
            arraylist.remove(index);
        }

        if(action.equals("ADD")) {
            arraylist.add(index, str);
        }
    }


    public static void getCommand(String str) {
        if(str.equals("LIST")) {
            for(int i = 0; i < arraylist.size(); i++) {
                strBuild.append(i + 1).append(". ").append(arraylist.get(i)).append("\n");
            }
/*            System.out.println("1. Washes the dishes\n" +
                               "2. Buy flat.\n" +
                               "3. Go abroad\n" +
                               "4. Buy car.");*/

            System.out.println(strBuild);
        } else {
            System.out.println("All Commands:\n1. ADD <number> \"What do you want to do\"\n" +
                                              "2. DELETE <number>");
        }
    }

    public static void findArgument(String str, int argument2) {
        if(str.equals("DELETE")) {
            for (int i = 1; i < 10; i++) {
                if (i == argument2) {
                    System.out.println("DELETE " + i);
                    list(i, null, "DELETE");
                }
            }
        } else {
            for (int i = 1; i < 10; i++) {
                if (i == argument2) {
                    System.out.println("ADD " + i);
                    list(i, str, "ADD");
                }
            }
        }
    }

    public static void main(String[] args) {
        int argument2 = 0;
        if (args.length == 0) {
            System.out.println("Starts me with 'COMMANDS' parameter and I show all my commands :))");
            System.out.println("Starts me with 'LIST' parameter and I show you, that I can to do!!!");
        } else if (args.length == 1) {
            if(args[0].equals("COMMANDS")) {
                getCommand("COMMANDS");
            } else if(args[0].equals("LIST")) {
                getCommand("LIST");
            } else {
                System.out.println("Enter correct command");
            }
        } else if(args.length == 2) {
            if(args[0].equals("DELETE")) {
                // 2 аргумент
                argument2 = Integer.parseInt(args[1]);
                findArgument("DELETE", argument2);
            } else {
                System.out.println("Enter correct command");
            }
        } else if (args.length == 3) {
            if(args[0].equals("ADD")) {
                // 2 аргумент
                argument2 = Integer.parseInt(args[1]);
                findArgument(args[2], argument2);
            } else {
                System.out.println("Enter correct command");
            }
        } else{
            System.out.println("Enter correct command");
        }
    }
}
