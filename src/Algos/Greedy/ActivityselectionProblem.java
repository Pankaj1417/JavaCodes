package Algos.Greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ActivityselectionProblem {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int rows = s.nextInt();
        int cols = s.nextInt();
        int[][] arr = new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j] = s.nextInt();
            }

        }
        sortByColumn(arr,1);
    }
    static int[][] sortByColumn(int[][] a , int col){
        Arrays.sort(a, Comparator.comparingInt(o -> o[col]));
        return a;
    }
    static void printIndicesOfActivities(int[]s,int[]f,int n){
        int i = 0,j;
        System.out.println(s[i] +" "+f[i]);
        for(j=1;j<n;j++){
            if(s[j]>=f[i]){
                System.out.println(s[j]+" "+f[j]);
                i =j;
            }
        }
    }
    static void printArray(int[][] arr){
        for (int[] ints : arr) {
            for (int anInt : ints) System.out.print(anInt + " ");
            System.out.println();
        }
    }
}
