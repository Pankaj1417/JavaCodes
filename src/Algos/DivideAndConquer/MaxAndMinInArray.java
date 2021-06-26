package Algos.DivideAndConquer;

import java.util.Scanner;
//class pair{
//    public int max,min;
//    public pair(int max,int min){
//        this.max = max;
//        this.min = min;
//    }
//}
//
//public class MaxAndMinInArray {
//    public static void main(String[] args) {
//        pair p = new pair(Integer.MIN_VALUE, Integer.MAX_VALUE);
//        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
//        int[] a = new int[n];
//        for (int i = 0; i < n; i++) {
//            a[i] = s.nextInt();
//        }
//        maxAndMins(a, 0, a.length - 1, p);
//        System.out.println("Minimum element in array is "+ p.min);
//        System.out.println("Maximum element in array is "+ p.max);
//
//    }
//
//    public static void maxAndMins(int[] a, int i, int j, pair p) {
//        int mid = (i + j) / 2;
//        if (i == j) {
//            if (p.max < a[i]) {
//                p.max = a[i];
//            }
//            if (p.min > a[i]) {
//                p.min = a[i];
//            }
//            return;
//        }
//        if (i == j - 1) {
//            if (p.max < Math.max(a[i], a[j])) {
//                p.max = Math.max(a[i], a[j]);
//            }
//            if (p.min > Math.min(a[i], a[j])) {
//                p.min = Math.min(a[i], a[j]);
//            }
//            return;
//        }
//        maxAndMins(a,i,mid,p);
//        maxAndMins(a,mid+1,j,p);
//    }
//}
//class pair{
//    public int max,min;
//    public pair(int max,int min){
//        this.max = max;
//        this.min = min;
//    }
//}

public class MaxAndMinInArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        int[] ans = new int [2];
        ans[0] = Integer.MIN_VALUE;
        ans[1] = Integer.MAX_VALUE;
        maxAndMins(a, 0, a.length - 1,ans);
        System.out.println("maximum"+ans[0]);
        System.out.println("minimum"+ans[1]);

    }

    public static int[] maxAndMins(int[] a, int i, int j,int[] ans) {
        int mid = (i + j) / 2;
        if (i == j) {
            if (ans[0] < a[i]) {
                ans[0] = a[i];
            }
            if (ans[1] > a[i]) {
                ans[1] = a[i];
            }
            return ans;
        }
        if (i == j - 1) {
            if (ans[0] < Math.max(a[i], a[j])) {
                ans[0] = Math.max(a[i], a[j]);
            }
            if (ans[1] > Math.min(a[i], a[j])) {
                ans[1] = Math.min(a[i], a[j]);
            }
            return ans;
        }
        maxAndMins(a,i,mid,ans);
        maxAndMins(a,mid+1,j,ans);
        return ans;
    }
}

