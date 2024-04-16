package Core_Java_OOPS.MultiThreading.ByImplement_Runnable_Interface;

public class Test implements Runnable{
    public void run(){
        System.out.println("Sucess!!!!..........");
    }

    public static void main(String[] args) {
        Test t1=new Test();
        Thread th=new Thread(t1);
        th.start();
    }
}
