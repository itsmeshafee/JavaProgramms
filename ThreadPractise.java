class ThreadPractise2 extends Thread{
    public void run(){
            System.out.println("Good Morning");
        }
    }
class ThreadPractise3 extends Thread {
    public void run() {
        System.out.println("Welcome");
    }
}
public class ThreadPractise {
    public static void main(String[] args) {
        ThreadPractise2 p1 = new ThreadPractise2();
        ThreadPractise3 p2 = new ThreadPractise3();
        p1.setPriority(6);
        p2.setPriority(9);
        System.out.println(p1.getPriority());
        System.out.println(p2.getPriority());
        System.out.println(Thread.currentThread().getState());
//        System.out.println(Thread.activeCount());
//        System.out.println(Thread.getAllStackTraces());
//        System.out.println(p1.getState());
//        System.out.println(p1.getThreadGroup());

        //p1.getStackTrace();
        //p1.getContextClassLoader();
        p1.start();
        p2.start();


    }
}
