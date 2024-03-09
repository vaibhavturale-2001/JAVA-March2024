package Basic_Java.Interview_Que_Basic.Numbers;

public class CheckPrime {
    public static void main(String[] args) {
        checkPrime(5);
    }

    static void checkPrime(int num){

        Boolean isPrime=true;
        for (int i=2;i<=num-1;i++){
            if(num%2==0){
                isPrime=false;
            }
        }
        System.out.println(isPrime);
    }
}
