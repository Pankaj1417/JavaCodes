package Algos.sorting;

import java.util.Scanner;

public class SelectionSort {
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
        for(int i=0;i<n;i++){
            int min = i;
            for(int j=i+1;j<n;j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            if(arr[i] != min){
                swap(i,min,arr);
            }
        }
    }

    private static void swap(int i, int j , int[]arr) {
        int x = arr[i];
        arr[i] = arr[j];
        arr[j] = x;
    }
}
