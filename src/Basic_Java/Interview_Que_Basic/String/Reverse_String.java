package Basic_Java.Interview_Que_Basic.String;

public class Reverse_String {
    public static void main(String[] args) {

        reverseString("ABCDEFG");
    }
    static void reverseString(String s){

        String newStr="";

        for (int i=s.length()-1;i>=0;i--){
            newStr=newStr+s.charAt(i);
        }
        System.out.println(newStr);
    }
}
