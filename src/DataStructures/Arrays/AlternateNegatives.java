package DataStructures.Arrays;
import java.util.*;
public class AlternateNegatives {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int t= s.nextInt();
        while(t-->0){
            int n = s.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++) {
                a[i] = s.nextInt();
            }
            alternateNegatives(a,n);
            printArray(a);
        }
    }
    static void alternateNegatives(int a[] , int n){
        int outOfPlace = -1;
         for(int i=0;i<n;i++){
             if(outOfPlace<0){
                 if((a[i]<0&&i%2==0)||(a[i]>=0&&i%2!=0)) outOfPlace = i;
             }
             if(outOfPlace>=0){
                 if((a[outOfPlace]>=0&&a[i]<0)||(a[outOfPlace]<0&&a[i]>=0)){
                     rightRotate(a,outOfPlace,i);
                     if(i-outOfPlace>2){
                         outOfPlace = outOfPlace+2;
                     }else{
                         outOfPlace = -1;
                     }
                 }
             }
         }
    }
    static void rightRotate(int[] a, int start, int end){
        int temp = a[end];
        for(int i=end;i>=start;i--){
            a[i] = a[i-1];
        }
        a[start] = temp;
    }
    static void printArray(int[] a) {
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
