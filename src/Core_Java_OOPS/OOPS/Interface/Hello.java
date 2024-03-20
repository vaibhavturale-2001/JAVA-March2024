package Core_Java_OOPS.OOPS.Interface;

public class Hello implements InterF{

    void hello(){
        System.out.println("hello");
    }

    @Override
    public void hii() {
        System.out.println("hii Baby");
    }

    public static void main(String[] args) {
        Hello h1=new Hello();
        h1.hello();
        h1.hii();
    }
}
