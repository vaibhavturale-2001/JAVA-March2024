package Core_Java_OOPS.OOPS.Inheritance.Multiple;

public class Child  extends Parent1 implements Parent2 {
    @Override
    public void parent2(){
        System.out.println("I am parent2");
    }
    public static void main(String[] args) {
        Child c1=new Child();
        c1.parent1();
        c1.parent2();
    }
}
