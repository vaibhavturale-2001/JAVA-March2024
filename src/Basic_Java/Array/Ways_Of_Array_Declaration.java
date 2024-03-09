package Basic_Java.Array;

public class Ways_Of_Array_Declaration {
    public static void main(String[] args) {

        int[] arr=new int[]{1,2,3};
        int[] arr1={10,20,30,40,50};
        int[] arr2=new int[50];

        System.out.println(arr[0]);
        System.out.println(arr.length);
        System.out.println(arr1[3]);

        for (int i=0;i< arr1.length;i++){
            System.out.println(arr1[i]);
        }
        for (int num:arr1){
            System.out.println(num);
        }

    }
}
