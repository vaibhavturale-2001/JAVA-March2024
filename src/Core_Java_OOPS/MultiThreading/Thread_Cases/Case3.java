package Core_Java_OOPS.MultiThreading.Thread_Cases;


//Performing multiple task from multiple thread
public class Case3 extends Thread{
    public void run(){
        System.out.println("Task 10");
    }
}

class Case33 extends Thread{
    public void run(){
        System.out.println("Task 20");
    }
}

class Case333 extends Thread{
    public void run(){
        System.out.println("Task 30");
    }
}

class Main{
    public static void main(String[] args) {
        Case3 th1=new Case3();
        th1.start();

        Case33 th2=new Case33();
        th2.start();

        Case333 th3=new Case333();
        th3.start();
    }
}
