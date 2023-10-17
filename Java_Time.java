import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Java_Time {
    public static void main(String[] args) {
        LocalDate d = LocalDate.now();
        LocalTime t = LocalTime.now();
        LocalDateTime dt = LocalDateTime.now();
        System.out.print(d);
        System.out.print("  ");
        System.out.println(t);
        System.out.println(dt);
    }
}
