package Basic_Java.Array;

public class Print_SubArray {
    public static void main(String[] args) {
        int[] arr=new int[]{2,3,5,7,8,9,11,22,33,32,44,43,45,56,48};

        int startIndex=2;
        int endIndex=7;
        printSubArray(arr,startIndex,endIndex);
    }

    static void printSubArray(int[] arr,int startIndex, int endIndex){
        for (int i=startIndex;i<=endIndex;i++){
            System.out.println(arr[i]);
        }
    }
}
