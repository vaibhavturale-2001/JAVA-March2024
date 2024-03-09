package Basic_Java.String;

public class Reverse_String {
    public static void main(String[] args) {

        String checkPalindrome=reverseString();
        System.out.println(checkPalindrome);
    }

    static String reverseString(){

        String str="madam";
        String newStr="";

        for (int i=str.length()-1;i>=0;i--){
            newStr=newStr+str.charAt(i);
        }
        System.out.println("Original String: "+str);
        System.out.println("Reverse String: "+newStr);

        if (str.equals(newStr)){
            return "String is Palindrome";
        }else {
            return "String is Not Palindrome";
        }
    }
}
