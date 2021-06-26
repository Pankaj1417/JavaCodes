package CppCodingNinjas.NumberTheory;

import java.util.Scanner;

public class SachinAndVarunProblem {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-->0){
            long a,b,d;
            a =s.nextLong();
            b = s.nextLong();
            d = s.nextLong();
            long gcd = gCD(a,b);
            if(d%gcd == 0){
                continue;
            }
            if(d == 0){
                System.out.println("1");
                continue;
            }
            a/=gcd;
            b/=gcd;
            d/=gcd;

            long y1 = ((d%a)*findModInverse(b,a))%a;
            long firstValue = d/b;
            if(y1>firstValue){
                System.out.println("0");
                continue;
            }
           long n = (firstValue-y1)/b;
            System.out.println(n+1);
        }
    }
    // Euclids GCD
    static long gCD(long a,long b){
        if(b==0) return  a;
        return gCD(b,a%b);
    }
    //Extended euclids
    static Triplet extendedEuclids(long a , long b){
        Triplet ans = new Triplet();
        if(b == 0) {
            ans.gcd = 1;
            ans.x = 1;
            ans.y = 0;
            return ans;
        }
        Triplet subAns = extendedEuclids(b,a%b);
         ans.gcd = subAns.gcd;
         ans.x = subAns.x;
         ans.y = subAns.y;
         return ans;
    }
    // ModInverse
    static long findModInverse(long a ,long m){

        long ans =  extendedEuclids(a,m).x;
       return (ans % m + m)%m;
    }
}

