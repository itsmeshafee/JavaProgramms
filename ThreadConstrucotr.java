class Mythr1 extends Thread {
    public Mythr1(String name){
        super(name);
    }
    public void run(){
        while (true){
            System.out.println("I am a Thread " + this.getName());
        }
    }
}
public class ThreadConstrucotr {
    public static void main(String[] args) {
        Mythr1 t1 = new Mythr1("shafi");
        Mythr1 t2 = new Mythr1("shafee");
        Mythr1 t3 = new Mythr1("shafiq");
        Mythr1 t4 = new Mythr1("sha");
        Mythr1 t5 = new Mythr1("s");
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t5.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();


    }
}
