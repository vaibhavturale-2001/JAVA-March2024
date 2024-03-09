package Basic_Java.Interview_Que_Basic.Numbers;

public class SumOfDigits {

    public static void main(String[] args) {
        sumOfDigit(1234);
    }
    static void sumOfDigit(int num){
        int sum=0;
        while(num!=0){
            int last_Digit=num%10;
            num=num/10;
            sum=sum+last_Digit;
        }
        System.out.println(sum);
        System.out.println("Sum of Digitsv:"+sum);
    }

}
