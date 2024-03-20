package Core_Java_OOPS.MultiThreading.ByExtend_ThreadClass;

public class Main extends Thread{

    public void run(){
        System.out.println("Run method is invoked");
    }

    public static void main(String[] args) {
        Main m1=new Main();
        m1.start();
    }
}
