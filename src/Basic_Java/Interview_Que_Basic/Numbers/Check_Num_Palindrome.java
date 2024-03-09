package Basic_Java.Interview_Que_Basic.Numbers;

public class Check_Num_Palindrome {
    public static void main(String[] args) {
        checkPalindrome();
    }

    static void checkPalindrome(){
        int num=121;
        int revNum=0;
        int digit;
        int temp=revNum;

        while (num>0){
            digit=num%2;
            revNum=(revNum*10) + digit;
            num=num/10;
        }
        System.out.println("Original Number: "+num);
        System.out.println("New Number: "+revNum);

        if (num==temp){
            System.out.println("Given Number is Palindrome");
        }else {
            System.out.println("Given Number is Not Palindrome");
        }
    }
}
