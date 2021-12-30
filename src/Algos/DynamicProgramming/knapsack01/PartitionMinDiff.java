package Algos.DynamicProgramming.knapsack01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// In this question we are given an array and we have to  partition that array into two disjoint subsets such that
// the difference of sum for both the partitions over the array is minimum and print the minimum difference

public class PartitionMinDiff {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int sum = 0;
        for (int x : arr) {
            sum += x;
        }
        System.out.println(recursiveDiff(n - 1, arr, sum, 0));
        int[][] dp = new int[n + 1][sum + 1];
        for (int[] a : dp) {
            Arrays.fill(a, -1);
        }
        System.out.println(memoization(n, arr, sum, 0, dp));

    }

    //Recursive function
    static int recursiveDiff(int ind, int[] arr, int p1, int p2) {
        if (ind == 0 || p1 == 0) {
            return Math.abs(p2 - p1);
        }

        if (arr[ind] <= p1) {
            return Math.min(recursiveDiff(ind - 1, arr, p1 - arr[ind], p2 + arr[ind])
                    , recursiveDiff(ind - 1, arr, p1, p2));

        } else {
            return recursiveDiff(ind - 1, arr, p1, p2);
        }
    }

    //Memoization
    static int memoization(int ind, int[] arr, int p1, int p2, int[][] dp) {
        if (ind == 0 || p1 == 0) {
            return Math.abs(p1 - p2);
        }
        if (dp[ind][p1] != -1) {
            return dp[ind][p1];
        } else {
            if (arr[ind - 1] <= p1) {
                return dp[ind][p1] = Math.min(memoization(ind - 1, arr, p1 - arr[ind - 1], p2 + arr[ind - 1], dp)
                        , memoization(ind - 1, arr, p1, p2, dp));

            } else {
                return dp[ind][p1] = memoization(ind - 1, arr, p1, p2, dp);
            }
        }
    }

    //topDown
    public int topDown(int[] arr) {
        int n = arr.length;
        int sum=0;
        for(int x : arr){
            sum += x;
        }

        Boolean[][] dp = new Boolean[n+1][sum/2+1];
        for(int i=0;i<=n;i++){
            dp[i][0] = true;
        }

        for(int i=1; i< dp[0].length;i++){
            dp[0][i] = false;
        }

        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                if(arr[i-1]<=j){
                    dp[i][j] = dp[i-1][j-arr[i-1]] || dp[i-1][j];
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<dp[0].length;i++){
            if(dp[n][i]){
                al.add(i);
            }
        }
        return sum - 2*al.get(al.size()-1);
    }

}

