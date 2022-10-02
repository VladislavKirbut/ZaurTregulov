package skilllbox5.homework5;

import java.sql.SQLOutput;

public class XLetter {
    public static void main(String[] args) {
        String [][] stringList = new String[7][7];

        for(int i = 0; i < stringList.length; i++) {
            for(int j = 0; j < stringList[i].length; j++) {
                if (i == j || j == stringList[i].length - 1 - i) {
                    System.out.print("X");
                }
                System.out.print(" ");
            }
            System.out.print("\n");
        };
    }
}
