package Core_Java_OOPS.MultiThreading.Thread_Naming;

public class Test {
    public static void main(String[] args) {

        System.out.println("Hello");
        System.out.println(Thread.currentThread().getName());  //main
        Thread.currentThread().setName("Vaibhav");
        System.out.println(Thread.currentThread().getName()); //Vaibhav
        System.out.println(Thread.currentThread().isAlive()); //True

    }
}
