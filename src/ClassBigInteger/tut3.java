package ClassBigInteger;
import java.math.*;
import java.util.*;
public class tut3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-->0){
            int n = s.nextInt();
            BigInteger fact = BigInteger.valueOf(1);
            if(n==0){
                System.out.println("1");
                return;
            }
            if(n<0){
                System.out.println("Entwe valid number");
                return;
            }
            else{
                for(int i=1;i<=n;i++){
                    fact = fact.multiply(BigInteger.valueOf(i));
                }
                System.out.println(fact);

            }
        }
    }
}
