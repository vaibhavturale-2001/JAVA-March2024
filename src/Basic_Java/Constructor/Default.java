package Basic_Java.Constructor;

public class Default {
    //creating a default constructor
    void Bike1() {
        System.out.println("Bike is created");
    }
    //main method
    public static void main(String args[]){
        //calling a default constructor
        Default b=new Default();
        b.Bike1();

    }
}
