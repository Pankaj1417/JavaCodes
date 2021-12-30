package Algos.sorting;

import java.util.Scanner;
//We are comparing the consecutive values and swaping them ,
// at the each iteration the maximum among all is moving to the end of the array
public class BubbleSort {
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
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<i;j++){
                if(arr[j] > arr[j+1]){
                    swap(j,j+1,arr);
                }
            }
        }
    }

    private static void swap(int i, int j , int[]arr) {
         int x = arr[i];
         arr[i] = arr[j];
         arr[j] = x;
    }
}
