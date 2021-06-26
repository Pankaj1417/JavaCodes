package CppCodingNinjas.NumberTheory;

                                          // Euclid's Algorithm

import java.util.Scanner;
class Triplet{
    int gcd;
    int x;
    int y;
}
public class GCD {

    static int calculateGCD(int x, int y)
    {
       if(y==0) return x;
       return calculateGCD(y,x%y);
    }
    static Triplet extendedEuclid(int a, int b){

        // Euclids Base Case

        if(b==0){
            Triplet ans = new Triplet();
            ans.gcd = a;
            ans.x =1;
            ans.y = 0;
            return ans;
        }
        // Extended Euclids

        Triplet subAns = extendedEuclid(b,a%b);
        Triplet ans = new Triplet();
        ans.x = subAns.y;
        ans.y = subAns.x-(a/b)*subAns.y;
        ans.gcd = subAns.gcd;
        return ans;
    }

    public static void main(String[] args)
    {
        int a,b;
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();
        System.out.println(calculateGCD(a,b));
//       Triplet finalAns = extendedEuclid(a,b);
//        System.out.print(finalAns.gcd+" "+ finalAns.x+" " + finalAns.y);
    }
}
