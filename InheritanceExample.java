class Base
{
    int x;
    public int getx(){return x;}
    public void setx(int x){
        System.out.println("I am in base setting 'x' now");
        this.x=x;
    }
    public void Printme(){
        System.out.println("Hello I am Constructor");
    }
}
class Derived extends Base{
    int y;
    public int gety(){return y;}
    public void sety(int y){
        System.out.println("I am in derived setting 'y' now");
        this.y=y;
    }
}
public class InheritanceExample {
    public static void main(String[] args) {
        Derived b=new Derived();
        b.setx(5);
        System.out.println(b.getx());
        b.sety(10);
        System.out.println(b.gety());

    }
}
