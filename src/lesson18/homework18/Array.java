package lesson18.homework18;

import java.util.Arrays;

public class Array {
    public void showArray(String [][] str) {
        System.out.println(Arrays.toString(str));
    }

    public static void main(String[] args) {
        String[][] mass = {{"2","3"},{"2","7"},{"4","6"}};
        Array arr = new Array();
        arr.showArray(mass);
    }
}
