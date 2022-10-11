package epam.io;

import java.text.ParseException;

public class LearnMainUnchecked3 {
    public static void main(String[] args) {
        String [] array = {"42", "0", "-Y", "33"};
        int result;
        int value;
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            try {
                result = Integer.parseInt(array[i]);
                try {
                    value = 100 / result;
                    sum += value;
                } catch (ArithmeticException e) {
                    System.out.println(e);
                }
            } catch(NumberFormatException e) {
                System.out.println(e);
            }
        }
        System.out.println(sum);
    }
}
