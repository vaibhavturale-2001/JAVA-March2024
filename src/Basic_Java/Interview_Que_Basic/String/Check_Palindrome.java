package Basic_Java.Interview_Que_Basic.String;

public class Check_Palindrome {
    public static void main(String[] args) {

        checkPalindrome("madam");
    }
    static void checkPalindrome(String s){

        String newStr="";

        for (int i=s.length()-1;i>=0;i--){
            newStr=newStr+s.charAt(i);
        }
        System.out.println("Old String :"+s);
        System.out.println("New String :"+ newStr);

        if (s.equals(newStr)){
            System.out.println("String is Palindrome");
        }else {
            System.out.println("String is Not Palindrome");

        }
    }
}
