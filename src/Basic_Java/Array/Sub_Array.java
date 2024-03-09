package Basic_Java.Array;

public class Sub_Array {
    public static void main(String[] args) {

        int[] arr=new int[]{3,5,7,9,22,44,53,35,};

        int startIndex=1;
        int endIndex=4;

        for (int i=startIndex;i<=endIndex;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
