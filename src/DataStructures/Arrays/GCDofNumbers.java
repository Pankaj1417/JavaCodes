package DataStructures.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class GCDofNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            int[] a = new int[n];
            int i;
            for (i = 0; i < n; i++) {
                a[i] = s.nextInt();
            }
            System.out.println(gcdOfNumbers(a,2,4));

        }
    }
    static ArrayList<Integer> gcdOfNumbers(int[]a,int start, int end){
        ArrayList<Integer> al = new ArrayList<>();
        for(int j=start;j<end;j++){
            for(int i=1;i<Math.min(a[j] ,a[j+1]);i++){
                if(a[i]%i==0&&a[i+1]%i==0) al.add(i);
            }
        }

        return al;
    }
}
