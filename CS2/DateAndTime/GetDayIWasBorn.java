import java.time.*;
import java.time.temporal.ChronoUnit;
public class GetDayIWasBorn {
    public static void main(String[] args) {
        LocalDate dob = LocalDate.of(2006, 2, 7);
        System.out.println(dob.getDayOfWeek());

        LocalDate today = LocalDate.now();
        System.out.println(dob.until(today));
        
        LocalDate christmas = LocalDate.of(2023, 12, 25);
        System.out.println(today.until(christmas, ChronoUnit.DAYS));
    }
}