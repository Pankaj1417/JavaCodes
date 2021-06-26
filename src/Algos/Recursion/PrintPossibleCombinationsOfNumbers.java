package Algos.Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class PrintPossibleCombinationsOfNumbers {
    static void printCombinations(int[] a,int start ,int end , int index,int r,int[] output){
        if(index==r){
            for(int j=0;j<r;j++){
                System.out.print(output[j]+" ");
            }
            System.out.println();
            return;
        }
        for(int i=start;i<=end&&end+1-i>=r-index;i++){
            output[index] = a[i];
            printCombinations(a,i+1,end,index+1,r,output);
//            while(a[i]==a[i+1]){
//                i++;
//            }
        }
    }
    public static void main(String[] args){
       Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       int r =s.nextInt();
       int[]a = new int[n];
       int[] output = new int[r];
       for(int i=0;i<n;i++){
           a[i] = s.nextInt();
       }
        Arrays.sort(a);
       printCombinations(a,0,n-1,0,r,output);
    }
}
