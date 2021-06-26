package Algos.DynamicProgramming;

public class MinimumNumberOfCoinsToGetSum {
    public static void main(String[] args) {
        int[] coins = {1, 5, 6, 9};
        int weight = 11;
        int[][] dp = new int[coins.length][weight + 1];
        for (int i = 0; i < coins.length; i++) {
            dp[i][0] = 0;
        }
        for (int i = 1; i <= weight; i++) {
            dp[0][i] = i;
        }
        for (int i = 1; i < coins.length; i++) {
            for (int j = 1; j <= weight; j++) {
                if (coins[i] > j) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = Math.min(dp[i - 1][j], 1 + dp[i][j - coins[i]]);
                }
            }
        }
        System.out.println(dp[coins.length-1][weight]);
     int i = coins.length-1;
     while(i>0){
            if(dp[i][weight] == dp[i-1][weight]){
                i--;
            }
            else{
                weight = weight-coins[i];
                System.out.print(coins[i]+" ");
            }
        }
    }
}
