package Core_Java_OOPS.OOPS.Polymorphism.Overloading;

public class Main {
    public static void main(String[] args) {

        add(10);
        add(20,10);
        sub(30,10);

    }
    public static void add(int a){
        System.out.println(a);
    }
    public static void add(int a,int b){
        System.out.println(a+b);
    }
    public static void sub(int a,int b){
        System.out.println(a-b);
    }
}
