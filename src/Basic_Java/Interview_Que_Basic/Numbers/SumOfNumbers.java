package Basic_Java.Interview_Que_Basic.Numbers;

public class SumOfNumbers {

    public static void main(String[] args) {
        sumOfNum(6);
    }
    static void sumOfNum(int number){
        int sum=0;

        for (int i=1;i<=number;i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }

}
