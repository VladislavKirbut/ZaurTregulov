package lesson19.homework19;

public class hm19 {

    public static String[] abc(String ...str) {
        String [] array = new String[str.length];
        for(int i = 0; i < str.length; i++) {
            array[i] = str[i];
        }
        return array;
    }

    public static void main(String[] args) {
        String [] arr = abc(null,null,null,null);
        for(String str: arr) {
            System.out.println(str + " ");
        }
    }
}
