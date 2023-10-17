class MyThreadRunnable1 implements Runnable{
    @Override
    public void run() {
        while (true) {
            System.out.println("I am Thread - 1");
        }
    }
}
class MyThreadRunnable2 implements Runnable{
    @Override
    public void run() {
        while (true) {
            System.out.println("I am Thread - 2");
        }
    }
}
public class ThreadRunnable {
    public static void main(String[] args) {
        MyThreadRunnable1 tr1 = new MyThreadRunnable1();
        Thread t1 = new Thread(tr1);
        MyThreadRunnable2 tr2 = new MyThreadRunnable2();
        Thread t2= new Thread(tr2);
        t1.start();
        t2.start();

    }
}
