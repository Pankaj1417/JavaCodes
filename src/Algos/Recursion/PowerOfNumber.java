package Algos.Recursion;
import java.util.*;
public class PowerOfNumber {
    public static void main(String[] args){
        long ans = powerOfNumber(3,5);
        System.out.println(ans);
    }
    static int powerOfNumber(int a , int b){
        if(b==0){
            return 1;
        }
        if(b%2==0){
            return powerOfNumber(a*a,b/2);

        }
        return a*powerOfNumber(a,b-1);    }
}
