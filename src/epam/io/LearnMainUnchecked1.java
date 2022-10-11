package epam.io;

public class LearnMainUnchecked1 {
    public static void main(String[] args) {
        String [] array = {"42", "0", "-Y", "33"};
        int sum = 0;
        int result = 0;
        for(int i = 0; i < array.length; i++) {
            try {
                result = Integer.parseInt(array[i]);
                sum += 100 / result;
            } catch (NumberFormatException e) {
                System.err.println(e);
            } catch (ArithmeticException e) {
                System.err.println(e);
            }
        }
        System.out.println(sum);
    }
}
