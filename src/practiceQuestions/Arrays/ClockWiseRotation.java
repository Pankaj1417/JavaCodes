package practiceQuestions.Arrays;

import java.util.Scanner;

public class ClockWiseRotation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t>0){
        int n = s.nextInt();
        int[] arr = new int[n];
        int i;
        for (i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int d = s.nextInt();
        int[] fr = new int[n];
        for(i=0;i<n;i++){
            if(i<d){
                fr[i+n-d] = arr[i];
            }
            else
                fr[i-d] = arr[i];
        }
        for(i=0;i<n;i++){
            System.out.print(fr[i]+ " ");
        }
        t--;
    }
 }
}



