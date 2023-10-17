import java.util.ArrayList;

public class ArrayListExamples {
    public static <object> void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();
        al2.add(1000);
        al2.add(2000);
        al2.add(3000);
        //Add all in al
        al.addAll(0,al2);
        al.add(al2.size());
        al.add(5);
        al.add(10);
        al.add(15);
        al.add(10);
        al.add(20);
        al.add(0,1); //add elements in index
        al.add(0,50);
        al.add(0,100);
        al.set(1,90);
        al.set(6,11);
        System.out.println("Is al Empty " + al.isEmpty());
        System.out.println("is 20 contain in al " + al.contains(20));
        System.out.println("is 20 contain in al2 " + al2.contains(20));
        System.out.println("15 in al index " + al.indexOf(15));
       System.out.println("10 in al index " + al.indexOf(10));
        System.out.println("10 in last index od al " + al.lastIndexOf(10));

        //al2.clear();

        //clear all the data in the list
        //al.clear();
        for(int i=0; i<al.size(); i++)
            System.out.println(al.get(i));
    }
}
