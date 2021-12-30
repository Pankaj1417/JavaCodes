package Algos.sorting;

import java.util.Scanner;

public class QuickSort{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        sort(arr,0,n-1);
        for(int x : arr){
            System.out.print(x + " ");
        }
    }
    public static void sort(int[] arr , int lb , int ub){
        if(lb<ub){
            int loc = partition(arr,lb,ub);
            sort(arr,lb,loc);
            sort(arr,loc+1,ub);
        }
    }
    static int partition(int[] arr , int left , int right){
        int start = left;
        int end = right;
        int pivot = arr[start];
        while (start < end){
           while (arr[start] <= pivot){
               start++;
           }
           while (arr[end] > pivot){
               end--;
           }
           if(start < end){
               swap(start,end,arr);
           }
        }
        swap(left,end,arr);
        return end;
    }

    private static void swap(int i, int j , int[]arr) {
        int x = arr[i];
        arr[i] = arr[j];
        arr[j] = x;
    }
}
