package Algos.DynamicProgramming;
import java.util.Arrays;

public class MinCoins {
    public static void main(String[] args){
        int n= 18;
        int[] a = {1,5,7};
        int [] dp = new int[n+1];
        Arrays.fill(dp,-1);
        dp[0] = 0;
     int ans = minCoins(n,a,dp) ;
        System.out.println(ans);
    }
//     Recursive approach
//    static int minCoins(int n,int []arr ){
//        if(n==0) return 0;
//        int ans =Integer.MAX_VALUE;
//        for(int i =0;i<arr.length;i++){
//          if(n-arr[i]>=0) {
//                int subAns = minCoins(n - arr[i], arr);
//                if(subAns+1<ans&&subAns!=Integer.MAX_VALUE) ans =subAns+1;
//            }
//        }
//        return ans;
//    }

//    RECURCIVE APPROACH WITH DYNAMIC PROGRAMMING
    static int minCoins(int n,int []arr , int[] dp){
        if(n==0) return 0;
        int ans =Integer.MAX_VALUE;
        for(int i =0;i<arr.length;i++){
          if(n-arr[i]>=0) {
              int subAns;
              if(dp[n-i]!=-1){
                  subAns = dp[n-i];
              }else {
                  subAns = minCoins(n - arr[i], arr, dp);
              }
                if(subAns+1<ans&&subAns!=Integer.MAX_VALUE) ans =subAns+1;
            }
        }
        return ans;
    }
}
