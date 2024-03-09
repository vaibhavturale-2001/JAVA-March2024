package Basic_Java.Interview_Que_Basic.Numbers;

public class Factorial_Num {
    public static void main(String[] args) {
        factorialOfNumbber(3);
    }
   /*
   * int num=3;
   * f(n)=1*2*3=
   *
   * */
    static void factorialOfNumbber(int number){
        int fact=1;
        int i=1;
        while (i<=number){
            fact=fact*i;
            i++;
        }
        System.out.println(fact);
    }
}
