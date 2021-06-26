package Prerequisites;

import java.util.Scanner;

public class RecursiveSorting {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int [] a = new int[n];
        for(int i =0;i<n;i++){
            a[i] = s.nextInt();
        }
        quickSort(a,0,a.length-1);
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }

    }
    static int partition(int[]a,int lb,int ub){
        int pivot = a[lb];
        int start = lb;
        int end = ub;
        while(start<end){
            while(pivot > a[start]){
                start++;
            }
            while(pivot<a[end]){
                end--;
            }
            if(start<end){
                int temp = a[start];
                a[start] = a[end];
                a[end] = temp;
            }else{
                int temp = pivot;
                pivot = a[end];
                a[end] = temp;
            }
            int temp = start;
            start =end;
            end = temp;
        }
        return end;
    }
    static void quickSort(int[]a,int lb , int ub){
        if(lb<ub){
            int loc = partition(a,lb,ub);

           quickSort(a,lb,loc-1);
           quickSort(a,loc+1,ub);


        }
    }
}


