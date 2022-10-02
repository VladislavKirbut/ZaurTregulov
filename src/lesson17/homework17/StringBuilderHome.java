package lesson17.homework17;

public class StringBuilderHome {
    public static boolean result = true;
    public static boolean equality(StringBuilder str1, StringBuilder str2) {
        if(str1.length() != str2.length()) {
            for(int i = 0; i < str1.length(); i++) {
                if(str1.charAt(i) != str2.charAt(i)) {
                    result = false;
                }
            }
            result = false;
        }
        return result;
    }

    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Ok");
        StringBuilder sb2 = new StringBuilder("Ok");

        boolean result = equality(sb1,sb2);
        System.out.println(result);
    }
}
