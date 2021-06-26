package CppCodingNinjas.NumberTheory;

import java.util.Scanner;

public class MultiplicativeModuloInverse {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a,m;
        a = s.nextInt();
        m = s.nextInt();

      if(GCD.extendedEuclid(a,m).gcd==1){
         int b = GCD.extendedEuclid(a,m).x;
          System.out.print("Multiplicative Modulo Inverse is : ");
          System.out.println(b);
      }else{
          System.out.println("Not Exists");
      }


    }

}
