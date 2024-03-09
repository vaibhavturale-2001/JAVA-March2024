package Basic_Java.Interview_Que_Basic.Numbers;

public class Rev_Num {
    public static void main(String[] args) {

        reveseNum(1234);
    }

    static void reveseNum(int num){
        int revNum=0;
        int digit;

        while (num>0){
            digit=num%2;
            revNum=(revNum*10) + digit;
            num=num/10;
        }
        System.out.println(revNum);
    }
}
