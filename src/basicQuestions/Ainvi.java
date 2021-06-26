package basicQuestions;

import java.util.*;
public class Ainvi {
    public static void main(String[] args){

            Scanner s = new Scanner(System.in);
            int t = s.nextInt();
            while(t-->0){
                int n = s.nextInt();
                int x = s.nextInt();
                int i;
                int[] a = new int[n];
                for(i=0;i<n;i++){
                    a[i] = s.nextInt();
                }
                int sum=0;
                while(i<n-2){
                    sum = a[i]-twoSum(a,n);
                }
                if(sum==x) {
                    System.out.println("1");
                    return;
                }
                System.out.println("0");
            }
        }
        static int twoSum(int[] a,int n){
            int i = 1;
            int j = n-1;
            while(i<=j){
                if(a[i]+a[j]>0){
                    j--;
                    return 1;
                }
                if(a[i]+a[j]<0){
                    i++;
                    return 1;
                }
            }
            return 0;
        }
}
