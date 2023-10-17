class MyThread1 extends Thread{
    public void run(){
       // while (true) {
            System.out.println("Thread - 1");
       // }
    }
}
class MyThread2 extends Thread{
    public void run(){
       // while (true) {
            System.out.println("Thread - 2");
        //}
    }
}
public class ThreadsExample {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
       // t1.start();
        //t2.start();
        System.out.println(t1.getName());
        System.out.println(t2.getName());
        System.out.println(t1.threadId());
        System.out.println(t2.threadId());
    }
}
