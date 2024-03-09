package Basic_Java.Function;

public class Example_returnType {
    public static void main(String[] args) {

        prod(10,10);

    }

    static int prod(int a, int b){
        int c=a*b;
        System.out.println(c);
        return c;
    }
}
