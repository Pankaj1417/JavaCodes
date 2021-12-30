package Algos.DynamicProgramming.LCS;

import java.util.Arrays;
import java.util.Scanner;

public class PrintLcs {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String s1,s2;
        int n,m;
        s1 = s.next();
        s2 = s.next();
        n = s1.length();
        m = s2.length();
        System.out.println(recursiveLcs(s1.toCharArray(),s2.toCharArray(),n,m));
        System.out.println(topDownPrint(s1.toCharArray(),s2.toCharArray(),n,m,new int[n+1][m+1]));
    }
    // maintaining the string throughout
    static String recursiveLcs(char[] s1 , char[] s2 , int n , int m){
        if(m == 0 || n == 0){
            return "";
        }
        if(s1[n-1] == s2[m-1]){
            return recursiveLcs(s1,s2,n-1,m-1)+s1[n-1];
        }else{
                   String t1 =  recursiveLcs(s1,s2,n-1,m);
                   String t2 = recursiveLcs(s1,s2,n,m-1);
                  return t1.length()> t2.length()?t1:t2;
        }
    }

    // using the length of top down to get the String
    static String topDownPrint(char[] s1 , char[] s2 , int n , int m ,int[][] dp){
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
        int i = n , j = m;
        StringBuilder ans = new StringBuilder();
        while (i>0 && j>0){
            if(s1[i-1] == s2[j-1]){
                i-=1;
                j-=1;
               ans.insert(0, s1[i]);
            }else{
                if(dp[i-1][j] >= dp[i][j-1]){
                    i-=1;
                }else{
                    j-=1;
                }
            }
        }
        return ans.toString();
    }

}
