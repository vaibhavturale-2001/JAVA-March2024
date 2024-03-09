package Basic_Java.Conditional_Statement;

public class if_else_if{
    public static void main(String[] args) {
       /* int num=11;
        int Number=12;
        if( num%2==0 ){
            System.out.println("Even");
        } else if (num>=Number) {
            System.out.println("Value is greater than Number");
        }else{
            System.out.println("Odd");
        }*/

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
