package Algos.sorting;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        sort(arr,n);
        for(int x : arr){
            System.out.print(x + " ");
        }
    }
    public static void sort(int[] arr , int n){
        for(int i=1;i<n;i++){
           int j=i-1;
           int cur = arr[i];
           while (j>=0 && arr[j] > cur){
               arr[j+1] = arr[j];
               j--;
           }
           arr[j+1] = cur;
        }
    }

    private static void swap(int i, int j , int[]arr) {
        int x = arr[i];
        arr[i] = arr[j];
        arr[j] = x;
    }
}
