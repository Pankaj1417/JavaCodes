package CppCodingNinjas.NumberTheory;

import java.util.Arrays;
import java.util.Scanner;

public class AdvancedGcd {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

    }
    static void countDivisors(int n ,int ans , Boolean[] arr){
        for(int i=0;i<=n;i++){
            
        }
    }
    static Boolean[] returnPrimes(int n){
        Boolean[] a = new Boolean[n+1];
        Arrays.fill(a,true);
        a[0] = false;
        a[1] = false;

        for(int i=2;i<Math.sqrt(n);i++){
            if(a[i] = true){
                for(int j=i*i;j<n;j+=i){
                    a[j] = false;
                }
            }

        }
        return a;
    }
}
