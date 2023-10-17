class Monkey{
    void Jump(){
        System.out.println("Jumping");
    }
    void Bit(){
        System.out.println("Biting");
    }
}
interface BasicAnimal{
    void Eat();
    void Sleep();
}
class Human extends Monkey implements BasicAnimal{
    void Speak(){
        System.out.println("Hello Sir...");
    }

    @Override
    public void Eat() {
        System.out.println("Eating");
    }

    @Override
    public void Sleep() {
        System.out.println("Sleeping");
    }
}
abstract class TelePhone {
    abstract void Ring();
    abstract void Lift();
    abstract void DisConnect();
}
class SmartPhone2 extends TelePhone{
    @Override
    void Ring() {
        System.out.println("Ringing");
    }
    public void Lift(){
        System.out.println("Lifting");
    }
    public void DisConnect(){
        System.out.println("DisConnecting...");
    }
}
public class Problems1 {
    public static void main(String[] args) {
//        Human h= new Human();
//        h.Eat();
//        h.Sleep();
//        h.Bit();
//        h.Speak();
//        h.Jump();
       SmartPhone2 s = new SmartPhone2();
       s.Lift();
       s.Ring();s.DisConnect();
    }
}
