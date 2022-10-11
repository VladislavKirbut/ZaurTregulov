package lesson28Date;
import java.time.*;

public class Test1 {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());

        LocalDate ld1 = LocalDate.of(2023, 12, 31);
        System.out.println(ld1);
        LocalDate ld2 = LocalDate.of(2023, Month.DECEMBER, 30);
        System.out.println(ld2);

        LocalTime lt1 = LocalTime.of(15, 30);
        System.out.println(lt1);

        LocalDateTime ldt1 = LocalDateTime.of(15, 1, 13, 30,23424234);
        System.out.println(ldt1) ;
    }
}
