package Prerequisites.BasicSorting;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        for(int i=1;i<n;i++){
            int j = i-1;
            int temp = a[i];
            while(j>=0 && temp < a[j]){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = temp;
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
