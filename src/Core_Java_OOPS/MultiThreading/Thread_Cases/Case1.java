package Core_Java_OOPS.MultiThreading.Thread_Cases;


//Performing single task from sigle thread
public class Case1 extends Thread{
    public void run(){
        System.out.println("Task1");
    }

    public static void main(String[] args) {
        Case1 t1=new Case1();    //Thread
        t1.start();
    }
}
