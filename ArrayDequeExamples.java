import java.util.ArrayDeque;

public class ArrayDequeExamples {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ad.add(1);
        ad.add(2);
        ad.add(3);
        System.out.println(ad.getFirst());
        System.out.println(ad.getLast());
    }
}
