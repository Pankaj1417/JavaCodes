package Algos.Recursion;

import java.util.Scanner;

public class EqulaSumBinaryStrings {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        equalSumBinaryStrings("","",0,0,n);
    }
    static void equalSumBinaryStrings(String s1,String s2,int c,int i ,int n){
            if(n==0){
                if(c==0){
                    System.out.println(s1+s2);
                    return;
                }

            }
            if(n==1){
                if(c==0){
                    System.out.println(s1+"0"+s2);
                    System.out.println(s1+"1"+s2);
                    return;
                }
            }
            if(Math.abs(c)<=n/2){
                equalSumBinaryStrings(s1+"0",s2+"0",c,i+1,n-2);
                equalSumBinaryStrings(s1+"1",s2+"0",c+1,i+1,n-2);
                equalSumBinaryStrings(s1+"0",s2+"1",c-1,i+1,n-2);
                equalSumBinaryStrings(s1+"1",s2+"1",c,i+1,n-2);

            }
    }
}
