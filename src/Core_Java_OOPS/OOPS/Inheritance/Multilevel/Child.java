package Core_Java_OOPS.OOPS.Inheritance.Multilevel;

public class Child extends Parent {
    void child(){
        System.out.println("I am Child");
    }

    public static void main(String[] args) {
        Child c1=new Child();
        c1.grandParent();
//        c1.Parent();
//        c1.child();
        Parent();

    }
}
