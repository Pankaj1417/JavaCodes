package CppCodingNinjas.NumberTheory;

import java.util.Scanner;

public class CountBalancedBinaryTrees {
    static int countBinaryPossibles(int h){
        int m = (int) (Math.pow(10,9)+7);
        if(h==0||h==1){
            return 1;
        }
       int x =  countBinaryPossibles(h-1);
       int y =  countBinaryPossibles(h-2);
       long res1 = (long)x*x;
       long res2 = (long)y*x*2;

       int ans1 = (int)(res1%m);
       int ans2 = (int)(res2%m);

        return (ans1+ans2)%m;

    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int h = s.nextInt();
        System.out.println(countBinaryPossibles(h));
    }
}
