package ClassBigInteger;
import java.math.*;
import java.math.BigInteger;

public class tut2 {
    public static void main(String[] args) {
//        BigInteger bi = new BigInteger(System.in);
        boolean x = true;
        boolean y = false;
//        System.out.println(x+y);

//        java: bad operand types for binary operator '+'
//        first type:  boolean
//        second type: boolean
        int z = 10;

//        System.out.println(x+z);

//        java: bad operand types for binary operator '+'
//        first type:  boolean
//        second type: int
        int v =10;
        String s =String.valueOf(v);
        BigInteger a = BigInteger.valueOf(v) ;
        BigInteger b = BigInteger.valueOf(v) ;
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
        System.out.println(a.divide(b));
        System.out.println(a.subtract(b));
        System.out.println(a.mod(b));  // remainder
//        System.out.println(a+b);
//        java: bad operand types for binary operator '+'
//        first type:  java.math.BigInteger


    }
}
