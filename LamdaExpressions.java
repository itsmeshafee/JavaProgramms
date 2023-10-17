interface lamda{
    void add(int a);
    //int sub(int b);
}
class lamda2{
    abstract class lamda3{
        abstract void sum(int a);
        abstract int subtraction(int a, int b);
    }
}

public class LamdaExpressions {
    public static void main(String[] args) {
        lamda l= (a)->{
            System.out.println("i am add method" + a);
        };
        l.add(6);

    }

}
