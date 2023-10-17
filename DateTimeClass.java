import java.util.Date;

public class DateTimeClass {
    public static void main(String[] args) {
        long l = System.currentTimeMillis()/1000/3600/24/365;
        System.out.println(l);
        System.out.println(Long.MAX_VALUE);
        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.getDate());
        System.out.println(d.getDay());
        System.out.println(d.getHours());
        System.out.println(d.getMinutes());
        System.out.println(d.getSeconds());

    }
}
