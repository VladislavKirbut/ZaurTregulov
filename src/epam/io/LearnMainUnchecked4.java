package epam.io;

public class LearnMainUnchecked4 {
    public static void main(String[] args) {
        String [] numbers = {"42", "0", "-Y", "33"};
        int sum = 0;
        for(int i = 0; i < numbers.length; i++) {
            try {
                sum += 100 / Integer.parseInt(numbers[i]);
                // при использовании оператора | не могут стоять родственные классы (исключения)
            } catch (ArithmeticException | NumberFormatException e) {
                System.out.println(e);
            }
        }
        System.out.println(sum);
    }
}
