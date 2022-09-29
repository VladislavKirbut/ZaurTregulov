package skilllbox5.homework5;

public class ReverseArray {
    public static void main(String[] args) {
        String text = " аждый охотник желает знать, где сидит фазан";

        String [] array = text.split(",?\\s+");

        for(int i = 0; i < array.length; i++) {
            System.out.println(array[array.length - 1 - i]);
        }
    }
}
