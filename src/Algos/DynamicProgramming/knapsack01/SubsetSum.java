package Algos.DynamicProgramming.knapsack01;

import java.util.Scanner;

public class SubsetSum {
    public static void  main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no of elements");
        int n = s.nextInt();
        System.out.println("Enter weights");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        System.out.println("Enter Sum");
        int sum = s.nextInt();

        int[][] dp = new int[n+1][sum+1];
        Boolean[][] dp1 =  new Boolean[n+1][sum+1];

        System.out.println(recursive(arr,sum,n));
        System.out.println(memorization(arr,sum,n,dp1));
        System.out.println(topDown(arr,sum,n));
    }

    //Recursion
    static boolean recursive(int[] arr , int sum , int index){
        if(index == 0 && sum >0){
            return false;
        }
        if(index > 0 && sum == 0){
            return true;
        }
        if(arr[index-1] <= sum){
            return recursive(arr,sum-arr[index-1],index-1) || recursive(arr,sum,index-1);
        }else{
            return recursive(arr,sum,index-1);
        }
    }

    // Memorization
    static boolean memorization(int[] arr , int sum , int index ,Boolean[][] dp){
        if(index == 0 && sum >0){
            return false;
        }
        if(index > 0 && sum == 0){
            return true;
        }
        if(dp[index][sum] != null){
            return dp[index][sum];
        }
        if(arr[index-1] <= sum){
            return dp[index][sum] = recursive(arr,sum-arr[index-1],index-1) || recursive(arr,sum,index-1);
        }else{
            return dp[index][sum] = recursive(arr,sum,index-1);
        }
    }

    //topDown
    static boolean topDown(int[] arr , int sum , int n){
        Boolean[][] dp = new Boolean[n+1][sum+1];

        //initialization
        for(int i=0;i<=n;i++){
            for(int j=0;j<=sum;j++){
                if(i== 0){
                    dp[i][j] = false;
                }
                if(j == 0){
                    dp[i][j] = true;
                }
            }
        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=sum;j++){
                if(arr[i-1] <= j){
                    dp[i][j] = dp[i-1][j] || dp[i-1][j-arr[i-1]];
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][sum];
    }
}
