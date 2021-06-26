// ELEMENTS APPEARING MORE THEN N/X TIMES
package DataStructures.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MultipleAppearance {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-->0){
            int n = s.nextInt();
            int x = s.nextInt();
            int [] a = new int[n];
            int i;
            for(i=0;i<n;i++){
                a[i] = s.nextInt();
            }
            System.out.println(multipleAppearance(a,x));

        }
    }
    static ArrayList<Integer> multipleAppearance(int[] a,int x){
        int i ;
        Arrays.sort(a);
        if(a.length==0) return null;
        ArrayList<Integer> al = new ArrayList<>();
        int count=1;
        for (i=0;i<a.length-1;i++){
            if(a[i] == a[i+1]){
                count++;
                if(count>(a.length/x)){
                    al.add(a[i]);
                }
            }
            else{
                count = 1;
            }
        }
        return al;
    }
}
