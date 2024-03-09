package Basic_Java.Interview_Que_Basic.Numbers;

public class Swap_Number {
    public static void main(String[] args) {
        swapNum();
    }

    static void swapNum(){
        int a=10;
        int b=20;
        int temp;

        temp=a;
        a=b;
        b=temp;

        System.out.println("Value of a: "+a);
        System.out.println("Value of a: "+b);
    }
}
