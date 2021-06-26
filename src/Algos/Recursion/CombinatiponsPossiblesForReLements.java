package Algos.Recursion;

//Print all possible combinations of r elements in a given array of size n

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class CombinatiponsPossiblesForReLements {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = s.nextInt();
        }
        int r = s.nextInt();
        ArrayList<Integer> l1 = new ArrayList<>();
            if(r<=n){
                combinationsPossibles(arr,arr.length,r,0,l1);
            }
    }
    static void combinationsPossibles(int[] a, int n, int r, int i, ArrayList<Integer> al){
        if(r<0){
            System.out.println(al);
            return;
        }
        for(int index =0;index<n;index++){
            al.add(a[i]);
               combinationsPossibles(a,n,r-1,i+1,al);
        }
    }
}

