package Algos.Recursion;

public class SumOfNaturalNum {
    public static void main(String[] args) {

        int ans = sumOfNaturalNumbers(5);
        System.out.println(ans);

    }

    static int sumOfNaturalNumbers(int n) {
       int sum =0;
       if(n==1){
           return 1;
       }
       sum =sum + sumOfNaturalNumbers(n-1);
       return sum;
    }
}