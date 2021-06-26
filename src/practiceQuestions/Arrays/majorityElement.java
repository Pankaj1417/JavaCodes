package practiceQuestions.Arrays;

import java.util.Scanner;

public class majorityElement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of ARRAY :");
        int n = s.nextInt();
        System.out.println("Enter the elements of ARRAY : ");
        int[] arr = new int[n];
        int i, j;
        for (i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int visited = -1;
        int[] fr = new int[n];
        for(i=0;i<n;i++){
            int c1=1;
            for(j=i+1;j<n;j++){
                if(arr[i]==arr[j]) {
                    c1++;
                    fr[j] = visited;
                }
            }
            if(fr[i]!=visited){
                fr[i]=c1;
            }
        }
        for(i=0;i<n;i++) {
            if (fr[i] != visited) {
                System.out.println("Element " + arr[i] + " appears  " + fr[i]+" times ");
            }
        }
        for(i=0;i<n;i++){
            if(fr[i]>n/2){
                System.out.println("Yes majority element present is :" +fr[i]);
            }
            else{
                System.out.println("No Majority element present in the array");
            }
        }
    }
}