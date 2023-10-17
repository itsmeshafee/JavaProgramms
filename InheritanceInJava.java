interface Bicycle{
    int a=45; // value is final doesn't change
    void applyBrake();
    void speedUp();
}
interface Bicycle1{
    int a=45; // value is final doesn't change
    int applyBrake(int v);
    int speedUp(int u);
}
class AvonCycle implements Bicycle, Bicycle1 {
    @Override
    public void applyBrake() {  //public is important
        System.out.println("I am applying Brake");
    }
    @Override
    public void speedUp() {
        System.out.println("I am Speed up the Cycle");
    }

    @Override
    public int applyBrake(int v) {
        return v+10;
    }
    @Override
    public int speedUp(int u) {
        return u*10;
    }
}
public class InheritanceInJava {
    public static void main(String[] args) {
        AvonCycle c= new AvonCycle();
        c.applyBrake();
        c.speedUp();
        System.out.println(c.applyBrake(5));
        System.out.println(c.speedUp(5));
    }
}
