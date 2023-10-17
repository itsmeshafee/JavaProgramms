class Circle{
    public int radius;
    Circle(){
        System.out.println("This is only");

    }
    Circle(int r){
        System.out.println("I am Circle Constructor");
        this.radius=r;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class Cylinder1 extends Circle{
    public int height;
    Cylinder1(int r, int h){
        super(r);
        System.out.println("I am Cylinder Constructor");
        this.height=h;
    }
    public double Volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}
public class InheritancePractice {
    public static void main(String[] args) {
        Cylinder1 c= new Cylinder1(12,5);
        System.out.println(c.Volume());
        System.out.println(c.area());

    }
}
