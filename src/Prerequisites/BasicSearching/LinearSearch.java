package Prerequisites.BasicSearching;

import java.util.*;

public class LinearSearch {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = s.nextInt();
        }
        int x = s.nextInt();
        Boolean present=false ;
        for(int i=0;i<n;i++){
            if(a[i] == x){
                present = true;
                break;
            }
        }
        if(present){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
