package Basic_Java.Interview_Que_Basic.Array;

public class SumOfArray {
    public static void main(String[] args) {
        int[] arr1=new int[]{1,4,4,1,100};
        sumOfArray(arr1);

    }

    static void sumOfArray(int[] arr){
        int sum=0;

        for (int i=0;i< arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}
