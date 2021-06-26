package Algos.Recursion;

import java.util.Scanner;

public class PrintPpossibleCombinationsOfNumbers_2 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int r =s.nextInt();
        int[]a = new int[n];
        int[] output = new int[r];
        for(int i=0;i<n;i++){
            a[i] = s.nextInt();
        }
        printCombinations(a,output,0,n,r,0);
    }
    static void printCombinations(int[] a , int[] output , int i, int n, int r,int index){
        if(index==r){
            for(int j=0;j<r;j++){
                System.out.print(output[j]+" ");
            }
            System.out.println();
            return;
        }
        if(i>=n){
            return;
        }
        output[index] = a[i];
        printCombinations(a,output,i+1,n,r,index+1);
        printCombinations(a,output,i+1,n,r,index);
    }
}
