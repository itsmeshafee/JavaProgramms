import java.util.ArrayList;

class MyGeneric<T1,T2,T3>{
    private T1 t1;
    private T2 t2;
    private T3 t3;
    public MyGeneric(T1 t1, T2 t2, T3 t3) {
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }

    public T2 getT2() {
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }

    public T3 getT3() {
        return t3;
    }

    public void setT3(T3 t3) {
        this.t3 = t3;
    }
}

public class GenericinJava {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(45);
        al.add("Shafee");
        int i = (int)al.get(0);
        System.out.println(i);
        //int s = (int) al.get(1); //Runtime Error
        //System.out.println(s);
        MyGeneric<Integer,String,Integer> mi = new MyGeneric<>(45,"Shafee", 20);
        System.out.println(mi.getT1());
        System.out.println(mi.getT2());
        System.out.println(mi.getT3());
        mi.setT1(27);
        System.out.println(mi.getT1());

        MyGeneric<String,String, Integer> mi2 = new MyGeneric<>("Shafi","shaik",27);
        System.out.println(mi2.getT1());
        System.out.println(mi2.getT2());
        System.out.println(mi2.getT3());

    }
}
