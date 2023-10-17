class Base1
{
    int x;
    Base1(){ System.out.println("I am Base class Constructor"); }
    Base1(int a){
        System.out.println("I am Constructor Overloading with a value of: " + a);
    }
    public int getX(){ return x;}
    public void setX(int x){
        this.x=x;
    }
}
class Derived1 extends Base1{
    int y;
    Derived1(){
       super(5);
        System.out.println("I am Derived class Constructor");
    }
    Derived1(int x, int y){
        super(x);
        System.out.println("I am Derived1 Constructor");
    }
    public int getY(){ return y;}
    public void setY(int y){
        this.y=y;
    }
}
class ChildOfDerived extends Derived1{
    ChildOfDerived(){
        System.out.println("I am ChildOfDerived class");
    }
    ChildOfDerived(int x, int y, int z){
        super(x,y);
        System.out.println("I am Child of Derived class " + x + " " + y);
    }
}
public class Constructor_in_Inheritance {
    public static void main(String[] args) {
//        Base1 b=new Base1();
//        Derived1 d=new Derived1();
//        Derived1 d=new Derived1(4,9);
//        ChildOfDerived cd=new ChildOfDerived(10,20,30);

    }
}
