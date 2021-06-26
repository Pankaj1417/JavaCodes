package CppCodingNinjas.BackTracking;
import java.util.Scanner;

public class AggressiveCows {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();
        while (t-->0){
            int n,c;
            n = s.nextInt();
            c =s.nextInt();
            int[] arr = new int[n];
            for(int i =0;i<n;i++){
                arr[i] = s.nextInt();
            }
            largestMinimumDistance(arr,0,arr[n-1]-arr[0],c);
        }
    }
    static void largestMinimumDistance(int[]a , int min, int max,int c){
        int mid = (min+max)/2;
        if(min == max)
        {
            System.out.println(min);
            return;
        }
        if(isPossibleAtMid(mid,a,c)){
            largestMinimumDistance(a,mid+1,max,c);
        }else{
            largestMinimumDistance(a,min,mid-1,c);
             }
        }
        static Boolean isPossibleAtMid(int mid,int[] a,int cows) {
        int count=1;
          int last_position = a[0];
          for(int i=0;i<a.length;i++){
              if(a[i]-last_position>=mid){
                  last_position = a[i];
                  count++;
              }
              if(count==cows) return true;
          }
          return false;
    }
}
