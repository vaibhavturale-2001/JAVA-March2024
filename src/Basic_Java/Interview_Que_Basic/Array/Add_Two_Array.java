package Basic_Java.Interview_Que_Basic.Array;

public class Add_Two_Array {

    public static void main(String[] args) {

        int[] arr1=new int[]{1,2,3,4};
        int[] arr2=new int[]{1,2,3,4};
        int[] arr3 = new int[3];

        for (int i=0;i< arr3.length;i++){
            arr3[i]=arr1[i]+arr2[i];
            System.out.println(arr3[i]);
        }


    }
}
