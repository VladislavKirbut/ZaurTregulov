package epam.io;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class LearnMainBorder {
    public static void main(String[] args) {
        double value;
        NumberFormat format = NumberFormat.getInstance(Locale.CANADA);
        try {
            value = (double) format.parse("111,042.05");
            System.out.println(value);
        } catch (ParseException e) {
            System.out.println(e);
        }
    }
}
