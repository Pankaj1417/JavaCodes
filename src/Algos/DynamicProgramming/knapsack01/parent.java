package Algos.DynamicProgramming.knapsack01;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;


public class parent {

    // Main function
    public static void  main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no of elements");
        int n = s.nextInt();
        System.out.println("Enter weight , profit");
        int[] wt = new int[n];
        int[] p = new int[n];
        for(int i=0;i<n;i++){
            wt[i] = s.nextInt();
            p[i] = s.nextInt();
        }
        System.out.println("Enter Bag Size");
        int bag = s.nextInt();
        int[][] dp = new int[n+1][bag+1];
        System.out.println(topDown(dp,wt,p,n,bag));
       for (int[] arr : dp){
           Arrays.fill(arr,-1);
       }
        System.out.println(memorization(wt,p,n,bag,dp));
    }
    
    // Using dp array
    static int topDown(int[][] dp , int[] wt , int[] p , int n ,int cap){
        //Initialization
        for(int i=0;i<=n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0){
                    dp[i][j] = 0;
                }
            }
        }
        // Getting max profit
        for(int i=1;i<=n;i++){
            for(int j=1;j<=cap;j++){
                if(wt[i-1] <= j){
                    dp[i][j] = Math.max(p[i-1]+dp[i-1][j-wt[i-1]],dp[i-1][j]);
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][cap];
    }

    // Using Memorization
    static int memorization(int[] wt, int[] profit,int index,int weight,int[][] dp){
        if(index == 0 || weight == 0){
            return 0;
        }
        if(dp[index][weight] != -1){
            return dp[index][weight];
        }
        if(wt[index-1] <= weight){
            return dp[index][weight] = Math.max(profit[index-1]+memorization(wt,profit,index-1,weight-wt[index-1],dp),
                    memorization(wt,profit,index-1,weight,dp));
        }else{
            return dp[index][weight] = memorization(wt,profit,index-1,weight,dp);
        }
    }

}

