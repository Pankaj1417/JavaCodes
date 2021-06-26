package DataStructures.Arrays;
import java.util.*;
import java.lang.*;

public class SubArrayWithZeroSum {
    public static void main (String[] args) {
      Scanner s = new Scanner(System.in);
//        int t= s.nextInt();
//        while(t-->0){
//            int n = s.nextInt();
//            int[] a = new int[n];
//            for(int i=0;i<n;i++) {
//                a[i] = s.nextInt();
//            }
//            boolean present = false;
//            Set<Integer> set = new HashSet<>();
//            int sum=0;
//            for(int i=0;i<n;i++){
//                sum = sum+a[i];
//                if(set.contains(sum)){
//                    System.out.println("Yes");
//                    present = true;
//                    return;
//                }
//                set.add(sum);
//            }
//            if(!present) System.out.println("No");
//        }

        int t= s.nextInt();
        while(t-->0){
            int n = s.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++) {
                a[i] = s.nextInt();
            }
            ArrayList<Integer> al = new ArrayList<>();
            int sum=0;
            for(int i=0;i<n;i++){
                sum = sum+a[i];
                al.add(sum);
            }
            System.out.println(al);
            int max_sum = Integer.MIN_VALUE;
            for(int i=0;i+1<al.size();i++){
                max_sum = Math.max(max_sum,al.get(i));
            }
            System.out.println(max_sum);
        }
    }
}


// GFG SOLUTION



//class GFG {
//    public static void main (String[] args) {
//        //code
//        //code
//        Scanner scan = new Scanner(System.in);
//        int t = scan.nextInt();
//        while(t>0)
//        {
//            int n = scan.nextInt() ;
//            int arr[] = new int[n];
//            for(int i = 0; i<n;i++)
//            {
//                arr[i] = scan.nextInt();
//            }
//            findsum(arr,n);
//            t--;
//            System.out.println();
//        }
//    }
//
//    static void findsum(int arr[],int n)
//    {
//
//        for(int i=0;i<n;i++)
//            if(arr[i]==0){
//                System.out.print("Yes ");return ;
//            }
//        int sum=0;
//        for(int i=0;i<n-1;i++)
//        {   sum = arr[i];
//            for(int j=i+1;j<n;j++){
//                sum = sum +arr[j];
//                if(sum == 0){
//                    System.out.print("Yes ");return;
//                }
//            }
//            sum=0;
//        }
//
//        System.out.print("No ");return;
//    }
//
//
//}
//
//
