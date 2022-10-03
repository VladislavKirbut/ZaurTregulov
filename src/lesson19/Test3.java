package lesson19;

public class Test3 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("Bye");
        StringBuilder sb3 = new StringBuilder("Ok");
        int [] array = {0, 6, 4, 1};
        StringBuilder [] mass = {sb1,sb2,sb3};

        for(int i = 0; i < array.length; i++) {
            array[i] = 3;
        }

        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        // не получится (с foreach мы не можем поменять значения ссылочных и примитивных типов данных)
/*        for(int a: array) {
            a = 3;
        }*/

        for(StringBuilder str: mass) {
            str = new StringBuilder("hello");
        }
    }

}
