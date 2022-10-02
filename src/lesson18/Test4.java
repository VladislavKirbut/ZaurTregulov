package lesson18;
import java.util.Arrays;
public class Test4 {
    public static void main(String[] args) {
        int array1 [] = {1, 6, 3, 7, 4, 5, 9,3 };
        for(int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        Arrays.sort(array1);

        for(int i = 0; i < array1.length; i++) {
            System.out.println(array1[i] + " ");
        }
        System.out.println();
        System.out.println();
        int index1 = Arrays.binarySearch(array1, 3);
        System.out.println(index1);
    }
}
