package Basic_Java.Conditional_Statement;

public class Largest_Of_Three {
    public static void main(String[] args) {
        int a=1000;
        int b=500;
        int c=800;

        if (a>b && a>c){
            System.out.println("a is greater than b and c");
        } else if (b>a && b>c) {
            System.out.println("b is greater than a and c");
        }else {
            System.out.println("c is greater than a nad b");
        }
    }
}
