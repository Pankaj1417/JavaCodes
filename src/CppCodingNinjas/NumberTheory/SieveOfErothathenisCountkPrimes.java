package CppCodingNinjas.NumberTheory;

import java.util.Arrays;
import java.util.Scanner;

public class SieveOfErothathenisCountkPrimes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Boolean[] a = new Boolean[n+1];
        Arrays.fill(a,true);
        a[0] = false;
        a[1] = false;
        int count=0;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(a[i]){
                for(int j = i*i; j<=n;j+=i){
                    a[j] = false;
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(a[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}
