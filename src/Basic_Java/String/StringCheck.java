package Basic_Java.String;

public class StringCheck {
    public static void main(String[] args) {

        String name="vaibhav";
        String name2="vaibhav";

        String name10=new String("vaibhav");
        String name11=new String("vaibhav");

        System.out.println(name==name2);
        System.out.println(name==name10);
        System.out.println(name10==name11);
    }
}
