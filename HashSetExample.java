import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        hs.add(4);
        hs.add(5);
        System.out.println(hs);
        System.out.println(hs.toString());
        long l = System.currentTimeMillis()/1000/3600/24/365;
        System.out.println("No of Years "+ l);
        System.out.println(Long.MAX_VALUE);

    }
}
