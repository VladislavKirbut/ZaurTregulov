package lesson19;

public class Test9 {
    public static void main(String[] args) {
        int [] array = {3,1,-2,0};
        int [] array2 = {-9,1,5,2};

        for(int i = 0; i < array.length && i < array2.length; i++) {
            array[i] = 12;
            array2[i] = 3;
        }
    }
}
