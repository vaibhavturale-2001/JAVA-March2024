package Basic_Java.Interview_Que_Basic.Array;

public class SumOf_SubArray {
    public static void main(String[] args) {
        int[] arr=new int[]{2,3,4,5,6,7,8,9};
        int startIndex=2;
        int endIndex=5;

        sumOfSubArray(arr,startIndex,endIndex);
    }

    static void sumOfSubArray(int[] arr,int startIndex, int endIndex){

        int sum=0;

        for (int i=startIndex;i<=endIndex;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}
