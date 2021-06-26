package Algos.Recursion;
import java.util.*;

public class ArrayPartitionInEqualSum {
    public static void  main(String[] args) {
        int[] a = {2, 1, 5, 8, 4};
        ArrayList<Integer> ans = new ArrayList<>();
        int sum = sumOfArray(a);
        boolean isPossible = (sum & 1) == 0 && partition(a, sum / 2, 0, ans);
        if (isPossible) {
            for (int e : ans) {
                System.out.print(e+" ");
            }
        }else System.out.println("Not possible");
    }
    static int sumOfArray(int[] a){
       int n = a.length;
       int i,sum=0;
       for(i=0;i<n;i++){
           sum+=a[i];
       }
        return sum;
    }
    static boolean partition(int [] a,int sum,int i,ArrayList<Integer> ans){
        if(i>=a.length||sum<0) return false;
        if(sum==0) return true;
        ans.add(a[i]);
        boolean leftPossible = partition(a,sum-a[i],i+1,ans);
        if(leftPossible) return true;

//        this makes back tracking
        ans.remove(ans.size()-1);
        return partition(a,sum,i+1,ans);
    }
}
