abstract class Parent{
    abstract public void Greet();
    abstract public void Wish();
    abstract public int Greet(int x, int y);
}
class Child2 extends Parent{
    @Override
    public void Greet() {
        System.out.println("Good Morning");
    }

    @Override
    public void Wish() {
        System.out.println("How R U");
    }

    @Override
    public int Greet(int x, int y) {
        return x+y;
    }
}
public class AbstractMethod {
    public static void main(String[] args) {
        Child2 c= new Child2();
        c.Greet();
        c.Wish();
        System.out.println(c.Greet(2,5));
    }
}
