package Algos.DynamicProgramming.LCS;

import java.util.Arrays;
import java.util.Scanner;

public class SCSuperseq {
    // Find the length of supersequence which contains both the sequences and its length is minimum as possible
    // length of both - LCS
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String s1,s2;
        int n,m;
        s1 = s.next();
        s2 = s.next();
        n = s1.length();
        m = s2.length();

        int[][] dp = new int[n+1][m+1];
        System.out.println(topDownPrint(s1.toCharArray(),s2.toCharArray(),n,m,dp));

    }
    static int topDownPrint(char[] s1 , char[] s2 , int n , int m ,int[][] dp){
        Arrays.fill(dp[0] , 0);
        for(int i=0;i< dp.length;i++){
            dp[i][0] = 0;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(s1[i-1] == s2[j-1]){
                    dp[i][j] = 1+dp[i-1][j-1];
                }else{
                    dp[i][j] = Math.max(dp[i-1][j] , dp[j-1][i]);
                }
            }
        }
       return s1.length+s2.length - dp[n][m];
    }

}
