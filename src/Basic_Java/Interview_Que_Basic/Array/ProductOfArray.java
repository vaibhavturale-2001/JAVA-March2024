package Basic_Java.Interview_Que_Basic.Array;

public class ProductOfArray {
    public static void main(String[] args) {
        int[] arr=new int[]{2,2,2,2};
        prodOfArray(arr);
    }

    static void prodOfArray(int[] arr){
        int product=1;
        for (int i=1;i<arr.length;i++){
            product=product*arr[i];
        }
        System.out.println(product);
    }
}
