package Core_Java_OOPS.MultiThreading.Thread_Cases;


//Performing single task from multiple thread
public class Case2 extends Thread {
    public void run(){
        System.out.println("Task11");
    }

    public static void main(String[] args) {
        Case2 t1=new Case2();  //Thread 1
        t1.start();

        Case2 t2=new Case2();   //Thread 2
        t2.start();
    }
}
