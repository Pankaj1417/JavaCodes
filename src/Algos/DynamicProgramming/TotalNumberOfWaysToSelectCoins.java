package Algos.DynamicProgramming;

public class TotalNumberOfWaysToSelectCoins {
    public static void main(String[] args){
        int[] coins = {1,5,6,9};
        int weight = 11;
        int[][] dp = new int[coins.length][weight+1];
        for(int i=0;i<coins.length;i++){
            dp[i][0] = 1;
        }
        for(int i=1;i<=weight;i++){
            if(weight % coins[0]==0){
                dp[0][i] = 1;
            }
            else{
                dp[0][i] = 0;
            }
        }

        for(int i=1; i<coins.length; i++)
        {
            for(int j=1;j<=weight;j++)
            {
                if(coins[i]>j){
                    dp[i][j] = dp[i-1][j-1];
                }
                else{
                    dp[i][j] = dp[i-1][j]+dp[i][j-coins[i]];
                }
            }
        }
        System.out.println(dp[coins.length-1][weight]);
    }
}
