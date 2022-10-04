package lesson19.homework19;

public class hm19 {

    public static String[] abc(String[] ...str) {
        int length = 0;
        for(String[] str2: str) {
            length += str2.length;
        }
        String [] array = new String[length];
        int count = 0;
        for(String[] str2: str) {
            for(String s: str2) {
                array[count] = s;
                count++;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        String [] arr = abc(new String[]{"ok", "hello", "bye"}, new String[] {"ok", "hello", "bye"});
        for(String s: args) {
            for(int i = 0; i < arr.length; i++) {
                if(s.equals(arr[i])) {
                    arr[i] = null;
                }
            }
        }
        for(String s: arr) {
            System.out.println(s + " ");
        }
    }
}
