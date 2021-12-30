package Algos.DynamicProgramming.knapsack01;

import java.util.Arrays;
import java.util.Scanner;

        //Count the no. of subsets such that the difference of their sum is given
        // interchangable to count subset sum
        // s1-s2 = k
        //s1+s2 = sum
        //s1 = (k+sum)/2;
        //just find the no. of subset with given sum s1

public class countSubsetsWithDiff {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k =s.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        int sum =0;
        for(int x : arr){
            sum += x;
        }
        int s1 = (sum+k)/2;
        int[][] dp = new int[n+1][s1+1];
        Arrays.fill(dp[0],0);
        for(int i=0;i<=n;i++){
            dp[i][0] = 1;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=s1;j++){
                if(arr[i-1] <= j ){
                    dp[i][j] = dp[i-1][j-arr[i-1]] + dp[i-1][j];
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        System.out.println(dp[n][s1]);
    }


}
