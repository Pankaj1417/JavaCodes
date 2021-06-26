package Prerequisites.BasicSorting;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
       for(int i=0;i<n;i++){
           int min = i;
           for(int j=i;j<n;j++){
               if(a[j]<a[min]){
                   min = j;
               }
           }
           if(min !=i){
               int temp = a[i];
               a[i] = a[min];
               a[min] = temp;
           }
       }
       for(int i=0;i<n;i++){
           System.out.print(a[i]+" ");
       }
    }
}
