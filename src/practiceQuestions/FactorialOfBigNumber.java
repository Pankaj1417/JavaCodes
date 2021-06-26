package practiceQuestions;
import java.util.*;
import java.math.*;
public class FactorialOfBigNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            System.out.println(factorialOfNumber(n));
        }
    }

    static int factorialOfNumber(int n) {
//        BigInteger x = new BigInteger();
//        if(n==0) return BigInteger.ONE ;
//        if(n>0){
//            x = x.multiply(factorialOfNumber(n-1));
//        }
//        return x;
//    }
        if (n == 0) return 1;
        else if (n < 0) {
            return 0;
        }

        return n * factorialOfNumber(n - 1);

    }
}
