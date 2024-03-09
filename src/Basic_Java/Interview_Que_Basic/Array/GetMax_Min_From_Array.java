package Basic_Java.Interview_Que_Basic.Array;

public class GetMax_Min_From_Array {
    public static void main(String[] args) {

        int[] arr=new int[]{2,4,5,6,8,9,12,33,22,11,21,66};
        int max=getMax(arr);
        System.out.println("Maximum: "+max);
        int min=getMin(arr);
        System.out.println("minimumn: "+min);

    }

    static int getMax(int[] arr){
        int max=arr[0];
        for (int i=0;i< arr.length;i++){
            max=Math.max(max,arr[i]);
        }
        return max;
    }
    static int getMin(int[] arr){
        int min=arr[0];
        for (int i=0;i< arr.length;i++){
            min=Math.min(min,arr[i]);
        }
        return min;
    }
}
