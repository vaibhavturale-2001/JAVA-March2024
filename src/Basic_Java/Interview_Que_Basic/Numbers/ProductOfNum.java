package Basic_Java.Interview_Que_Basic.Numbers;

public class ProductOfNum {
    public static void main(String[] args) {
        productOfNum(1234);
    }

    static void productOfNum(int number){


        int product = 1;
        while (number != 0) {
            int digit = number % 10;
            product =product * digit;
            number =number/ 10;
        }
        System.out.println(product);
    }
}
