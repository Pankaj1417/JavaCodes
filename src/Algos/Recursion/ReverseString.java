package Algos.Recursion;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-->0){
            int n= s.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                a[i] = s.nextInt();
            }
            int[] b = new int[n];
            int count_zeroes = 0;
            for(int i=0;i<n;i++){
                if(a[i] == 0){
                    b[count_zeroes] = a[i] ;
                    count_zeroes++;
                }
            }
            int count_one = count_zeroes;
            for(int i=0;i<n;i++){
                if(a[i] == 1){
                    b[count_one] = a[i] ;
                    count_one++;
                }
            }
            int count_two = count_one;
            for(int i=0;i<n;i++){
                if(a[i] == 2){
                    b[count_two] = a[i] ;
                    count_two++;
                }
            }
            for(int i=0;i<n;i++){
                System.out.print(b[i]+" ");
            }
        }
    }
}
