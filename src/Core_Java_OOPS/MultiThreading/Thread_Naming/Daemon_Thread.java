package Core_Java_OOPS.MultiThreading.Thread_Naming;

public class Daemon_Thread extends Thread{
    public void run(){
        if(Thread.currentThread().isDaemon()){
            System.out.println("Daemon thread");
        }else {
            System.out.println("Child thread");
        }
    }
    public static void main(String[] args) {
        System.out.println("Main thread");
        Daemon_Thread t1=new Daemon_Thread();
        t1.setDaemon(true);
        t1.start();
    }
}
