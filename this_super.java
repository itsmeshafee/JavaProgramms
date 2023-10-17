class Ekclass{
    int a;
    public int getA(){ return a;}
    Ekclass(int a){this.a=a;}
}
class Doclass extends Ekclass{
    Doclass(int c){
        super(c);
        System.out.println("This is the constructor");
    }
}
public class this_super {
    public static void main(String[] args) {
//        Ekclass e=new Ekclass(5);
//        System.out.println(e.getA());
        Doclass d=new Doclass(10);
        System.out.println(d.getA());


    }
}
