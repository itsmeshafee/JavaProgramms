import static java.lang.System.*;

class A{
    public void meth1(){ out.println("I am Class A Method 1"); }
    public void meth2(){ out.println("I am Class A Method 2"); }
}
class B extends A{
    public void meth3(){ out.println("I am Class B Method 3");  }
    @Override
    public void meth2(){ out.println("I am Class B Method 2");  }
}
public class Method_Overriding {
    public static void main(String[] args) {
        A a=new A();
        a.meth1();
        a.meth2();
        B b=new B();
        b.meth1();
        b.meth2();
        b.meth3();
    }
}
