package Prerequisites.BasicSorting;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int [] a = new int[n];
        for(int i =0;i<n;i++){
            a[i] = s.nextInt();
        }

        for(int i=n-1;i>=0;i--){
            for(int j=0;j<i;j++){
                if(a[j]>a[j+1]){
                    int temp;
                   temp = a[j];
                   a[j] = a[j+1];
                   a[j+1] = temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }

}
