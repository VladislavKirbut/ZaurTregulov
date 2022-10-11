package epam.io;

public class LearnMainUnchecked5 {
    public static void main(String[] args) {
        String [] array = {"44", "0", "-Y", "33"};
        int counter = 0;
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            try {
                sum += 100 / Integer.parseInt(array[i]);
            } catch (ArithmeticException e) {
                System.err.println(e);
// в коде ниже (3 круг цикла) выбрасывается исключние NumberFormatException, но оно не обрабатывается, а блок finally
// выполнится всё-равно и программа завершится с исключением
            } finally {
                System.out.println("Counter = " + ++counter);
            }
        }
        System.out.println(sum);
    }
}
