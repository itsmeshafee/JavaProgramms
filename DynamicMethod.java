
class phone
{

    public void greet(){
        System.out.println("Heloo Greet");
    }
    public void on(){
        System.out.println("Turning on Phone");
    }
}

/**
 *
 */
class Smartphone extends phone
{
    public void name(){
        System.out.println("MY name is SmartPhone");
    }
    public void on(){
        System.out.println("Turning on SmartPhone");
    }
}
/**
 * @Author Shafi
 * @Version 20
 * @Since 2023
 * @See Oracle
 */
public class DynamicMethod {
    public static void main(String[] args) {
        /*phone obj =new phone();
        obj.greet();
        obj.on();
        Smartphone obj1=new Smartphone();
        obj1.name();
        obj1.on();*/
        phone obj = new Smartphone();
        obj.on();
        obj.greet();

    }
}
