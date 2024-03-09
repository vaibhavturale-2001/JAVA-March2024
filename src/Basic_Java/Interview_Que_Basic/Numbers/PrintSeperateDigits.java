package Basic_Java.Interview_Que_Basic.Numbers;

public class PrintSeperateDigits {
    public static void main(String[] args) {
        printSeperateDigit(12345);
    }

    static void printSeperateDigit(int number){
        String seperate=""+number;
        for (int i=0;i<seperate.length();i++){
            System.out.print(seperate.charAt(i)+" ");
        }
    }
}
