package Algos.sorting;

import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        int[] help = new int[n+1];
        sort(arr,0,n-1,help);
        for(int x : arr){
            System.out.print(x + " ");
        }
    }
    public static void sort(int[] arr , int lb , int ub ,int[] help){
        int mid;
        if(lb < ub){
           mid = lb + (ub-lb)/2;
           sort(arr,lb,mid,help);
           sort(arr,mid+1,ub,help);
           merge(arr,lb,mid,ub,help);
        }
    }
    static void merge(int[] arr , int left , int right , int mid , int[] help){
      int n1 = mid-left+1;
      int n2 = right-mid;
      int[] l = new int[n1];
      int [] r = new int[n2];
      for(int i=0;i<n1;i++){
          l[i] = arr[i+left];
      }

    }
}
