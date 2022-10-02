package lesson17;

class Car {}

public class lesson17 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Good day");
        StringBuilder sb3 = new StringBuilder(50);
        StringBuilder sb4 = new StringBuilder(sb3);
        System.out.println(sb2.length());
        System.out.println(sb2.charAt(4));
        System.out.println(sb2.indexOf("o", 2));

        String s = sb2.substring(5);
        System.out.println(s);
        String s2 = sb2.substring(5, 8);
        System.out.println(s2);

        sb2.append(22);
        sb2.append(sb2);
        System.out.println(sb2);
        System.out.println(sb2.insert(4,55));

        StringBuilder sb10 = new StringBuilder("Hello world");
        sb10.delete(3,6);
        System.out.println(sb10);

        sb10.deleteCharAt(5);
        System.out.println(sb10);

        sb10.reverse();
        System.out.println(sb10);

        StringBuilder sb12 = new StringBuilder("Hello");
        sb12.replace(0,5,"pete");

        int i = sb12.capacity();
        System.out.println(i);
    }
}
