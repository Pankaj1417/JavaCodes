package Prerequisites.BasicSearching;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = s.nextInt();
        }
        int x = s.nextInt();
        isPresent(a,0,a.length-1,x);
    }
    static void isPresent(int[]a,int lb , int ub ,int x) {
        int mid=0;
        if(lb<ub){
            mid = (lb + ub) / 2;
        }
        if(a[mid]==x){
            System.out.println(mid);
        }
        else if(a[mid]>x){
            isPresent(a,lb,mid-1,x);
        }
        else{
            isPresent(a,mid+1,ub,x);
        }
    }
}
