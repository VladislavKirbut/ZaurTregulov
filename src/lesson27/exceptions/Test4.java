package lesson27.exceptions;

public class Test4 {
    public static void main(String[] args) {
        // в данном примере exception не имеет место быть, так как ошибка очевидна
        // и мы её сами можем исправить, другой пример в Test5, там нужно применять обработку ошибок
        int[] array = {4, 8, 1};
        System.out.println("We have array.");
        try {
            System.out.println(array[5]);
            System.out.println("Good day.");
        }
        // ArrayIndexOfBoundsException e - идёт как параметр (e - название Exception)
        // чтобы мы смогли к нему обращаться
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Bil poiman exception");
        }
        finally {
            System.out.println("This is finally block");
        }

        System.out.println("This code isn't exception.");
    }
}
