package Sorting;

import java.util.Scanner;
public class Bubble_sort {
    public static void main(String[] args) {
        // BUBBLE SORT ALGORITH
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of elements you want in array");
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the element of array :");
            arr[i] = s.nextInt();
        }
        int temp =0;
        for(int j = 0;j<n;j++) {
            boolean tell = false;
            for (int i = 0; i < n - 1; i++) {

                if (arr[i] > arr[i + 1]) {
                    temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                    tell = true;
                   }
                }
            if(tell == false){
                break;
            }
        }
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
    }
}