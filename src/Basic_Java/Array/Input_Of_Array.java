package Basic_Java.Array;

import java.util.Scanner;

public class Input_Of_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of Array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter values:");
        for (int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Printing array");
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
