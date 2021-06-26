package practiceQuestions.Arrays;
//import java.util.*;
//public class Union {
//    public static void main(String[] args) {
//        Scanner s = new Scanner (System.in);
//        int t = s.nextInt();
//        while(t-->0){
//            int n1 = s.nextInt();
//            int n2 = s.nextInt();
//            int[] a = new int[n1];
//            int[] b = new int[n2];
//            Set<Integer> set1 = new HashSet<>();
//            Set<Integer> set2 = new HashSet<>();
//            int i;
//            for(i=0;i<n1;i++){
//                a[i] = s.nextInt();
//                set1.add(a[i]);
//              }
//            for(i=0;i<n2;i++){
//                b[i] = s.nextInt();
//                set1.add(b[i]);
//            }
//            set1.addAll(set2);
////            for(Integer e : set1){
////                System.out.print(e+" ");
////            }
//            System.out.println(set1.size());
//
//        }
//
//    }
//}




// { Driver Code Starts
import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            Solution g = new Solution();
            ArrayList<Integer> ans = g.duplicates(a, n);
            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        int i,j;
        ArrayList<Integer> a = new ArrayList<>();

        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(arr[i] == arr[j]){
                    if(a.contains(arr[i])) continue;
                    a.add(arr[i]);
                }
            }
        }
        if(a.size()==0)
        {a.add(-1);
            return a;}
        else {
            Collections.sort(a);
            return a;
        }
    }
}
