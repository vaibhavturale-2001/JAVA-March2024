package Basic_Java.Interview_Que_Basic.Array;

import java.util.Scanner;

public class Add_Two_Array_InputBy_User {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array1");
        int a1=sc.nextInt();
        System.out.println("Enter size of array2");
        int a2=sc.nextInt();

        int[] arr1=new int[a1];
        int[] arr2=new int[a2];
        int[] arr3=new int[a1];

        for (int i=0;i<arr1.length;i++){
            System.out.println("Enter input of array1");
            arr1[i]=sc.nextInt();
        }

        for (int i=0;i<arr2.length;i++){
            System.out.println("Enter input of array2");
            arr2[i]=sc.nextInt();
        }
         for (int i=0;i<arr3.length;i++){
             arr3[i]=arr1[i]+arr2[i];
             System.out.println(arr3[i]);
         }
    }
}
