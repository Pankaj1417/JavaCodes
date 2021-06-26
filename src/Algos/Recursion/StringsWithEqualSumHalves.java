package Algos.Recursion;
import java.util.Scanner;
public class StringsWithEqualSumHalves {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        equalSumSubstring("","",0,n);
//        generate("0",1,n,0);
//        generate("1",1,n,0);
    }
//    static void generate(String s, int i, int n,int count) {
//        if (i == n) {


//            System.out.println(s);
//        } else {
//            if(i<=n){
//                if (s.endsWith("0")) {
//                    generate(s + "0", i + 1, n,0);
//                    generate(s + "1", i + 1, n,0);
//                } else {
//                    generate(s + "0", i + 1, n,0);
//                }
//             }
//            }
//    }
    static void equalSumSubstring(String left,String right,int diff,int n){
        if(n==0){
            if(diff==0){
                System.out.println(left+right);
            }
        }
        if(n==1){
            if(diff==0){
                System.out.println(left+"0"+right+" ");
                System.out.println(left+"1"+right+" ");
            }
        }
        if(2*Math.abs(diff)<=n){
           equalSumSubstring(left+"1",right+"0",diff+1,n-2);
           equalSumSubstring(left+"1",right+"1",diff,n-2);
           equalSumSubstring(left+"0",right+"0",diff,n-2);
           equalSumSubstring(left+"0",right+"1",diff-1,n-2);
        }

    }
}