package epam.io;

public class LearnMainUnchecked {
    public static void main(String[] args) {
        String [] array = {"1", "10", "Y-"};
        int result = 0;
        try {
            result = Integer.parseInt(array[2]);
        } catch(NumberFormatException e) {
            result = -1;
        }
        System.out.println(result);
    }
}
