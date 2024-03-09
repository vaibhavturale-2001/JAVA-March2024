package Basic_Java.Interview_Que_Basic.Array;

public class Reverse_Array {
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,4,5};
        revArray(arr);

        reverseArray(arr,0,4);
    }


//    One way
   public static void revArray(int[] arr){

        for (int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }

//    Second way
    public static void reverseArray(int[] arr,int startIndex, int endIndex){
         startIndex=0;
         endIndex=arr.length-1;

         while (startIndex < endIndex){
             int temp=arr[startIndex];
             arr[startIndex]=arr[endIndex];
             arr[endIndex]=temp;
             startIndex++;
             endIndex--;
         }
         for (int revArray:arr){
             System.out.print(revArray+" ");
         }
    }
}
