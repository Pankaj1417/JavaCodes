package CppCodingNinjas.NumberTheory;

import java.util.Scanner;

public class IterativeModPower {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a,b,c;
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        System.out.println(iterativeModPower(a,b,c));
    }
    static int iterativeModPower(int a, int b, int c){
       int ans =1;
       while (b!=0){
           if((b&1)==1){
              ans = (ans*a)%c;

           }

           a =(a*a)%c;
           b = b/2;
       }
       return ans;
    }
}
