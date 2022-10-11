package epam.io;
// предыдущий пример  более правильный
public class LearnMainUnchecked2 {
    public static void main(String[] args) {
        String [] array = {"42", "0", "-Y", "33"};
        int sum = 0;
        int result = 0;
        try{
            for(int i = 0; i < array.length; i++) {
                result = Integer.parseInt(array[i]);
                sum = 100 / result;
            }
        } catch (ArithmeticException e) {
            System.err.println(e);
        } catch (NumberFormatException e) {
            System.err.println(e);
        }
        System.out.println(sum);
    }
}
