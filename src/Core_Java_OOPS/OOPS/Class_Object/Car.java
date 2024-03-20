package Core_Java_OOPS.OOPS.Class_Object;

public class Car {
    private String model;
    private String color;
    private int year;

   public Car(String model,String color,int year){
        this.model=model;
        this.color=color;
        this.year=year;
    }

    void desplyDetails(){
        System.out.println("model:"+model+" "+"color:"+color+" "+"year:"+year);
    }
}
