package Basic_Java.Constructor;

public class Parametric {
    int a;
    int b;

    Parametric(int i, int r){
        a=i;
        b=r;
    }
    void print(){
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        Parametric parametric=new Parametric(10,30);
        parametric.print();

    }
}
