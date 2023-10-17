import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime_Formatter {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-mm-yyyy -- E a");
        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;
       // String s =dt.format(DateTimeFormatter.ofPattern("dd/mm/yyyy hh:mm:ss"));
        String s1 = dt.format(df);
        System.out.println(s1);
    }
}
