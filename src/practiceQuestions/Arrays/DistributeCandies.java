package practiceQuestions.Arrays;

import java.util.*;

public class DistributeCandies {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of ARRAY :");
        int n = s.nextInt();
        System.out.println("Enter the elements of ARRAY : ");
        int[] arr = new int[n];
        int i;
        for (i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int[] fr = new int[n];
        for(i=0;i<n;i++){
            fr[i] =1;
        }
        for (i = 0; i < n-1; i++) {
            if (arr[i] < arr[i + 1]) {
                fr[i + 1] =  fr[i] +1 ;
            }
        }
        for (i=n-1; i >0; i--) {
            if (arr[i] < arr[i - 1]) {
               fr[i-1] = Math.max(fr[i]+1,fr[i-1]);
            }
        }
        long sum=0;
        for(i=0;i<n;i++){
            sum = sum+ (long)fr[i];
        }
        System.out.println(sum);

    }
}
