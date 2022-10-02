package epam.strings.stringbuilder;

public class StringBuilderCheck {
        public static void main(String[] args) {
                // также вместо строки мы можем передать целое число (размер буфера)
                StringBuilder strBuilder = new StringBuilder("");
                System.out.println(strBuilder.capacity());
                strBuilder.append("Vlad");
                System.out.println(strBuilder.length()); // проверяет размер строки
                System.out.println(strBuilder.capacity()); // проверяет размер буфера
                System.out.println(strBuilder);
        }
}
