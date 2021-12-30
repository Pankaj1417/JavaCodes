package Algos.DynamicProgramming.LCS;

import java.util.Arrays;
import java.util.Scanner;

public class LCS {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String s1,s2;
        int n,m;
        s1 = s.next();
        s2 = s.next();
        n = s1.length();
        m = s2.length();
        System.out.println(recursiveLcs(s1.toCharArray(),s2.toCharArray(),n,m));
        int[][] dp = new int[n+1][m+1];
        System.out.println(topDownLcs(s1.toCharArray(),s2.toCharArray(),n,m,dp));
        for (int[] ints : dp) {
            Arrays.fill(ints, -1);
        }
        System.out.println(memoizeLcs(s1.toCharArray(),s2.toCharArray(),n,m,dp));
    }
    static int recursiveLcs(char[] s1 , char[] s2 , int n , int m){
        if(m == 0 || n == 0){
            return 0;
        }
        if(s1[n-1] == s2[m-1]){
            return 1+recursiveLcs(s1,s2,n-1,m-1);
        }else{
            return Math.max(
                    recursiveLcs(s1,s2,n-1,m),recursiveLcs(s1,s2,n,m-1)
            );
        }
    }
    static int memoizeLcs(char[] s1 , char[] s2 , int n , int m , int[][] dp){
        if(m == 0 || n == 0){
            return 0;
        }
        if(dp[n][m] != -1){
            return dp[n][m];
        }else
            if(s1[n-1] == s2[m-1]){
                return dp[n][m] = 1+recursiveLcs(s1,s2,n-1,m-1);
            }else{
                return dp[n][m] = Math.max(
                        recursiveLcs(s1,s2,n-1,m),recursiveLcs(s1,s2,n,m-1)
                );
            }
    }
    static int  topDownLcs(char[] s1 , char[] s2 , int n , int m , int[][] dp){
        Arrays.fill(dp[0] , 0);
        for(int i=0;i<=n;i++){
            dp[0][i] = 0;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(s1[i-1] == s2[j-1]){
                    dp[i][j] = 1+dp[i-1][j-1];
                }else{
                    dp[i][j] = Math.max(dp[i-1][j] , dp[i][j-1]);
                }
            }
        }
        return dp[n][m];
    }
}
