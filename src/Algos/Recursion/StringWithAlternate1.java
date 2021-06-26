package Algos.Recursion;

import java.util.Scanner;

public class StringWithAlternate1 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        createAlternate_1("0",1,n);
        createAlternate_1("1",1,n);

    }
    static void createAlternate_1(String s,int i,int n){
        if(i==n){
            System.out.println(s);
            return;
        }
        if(s.charAt(i-1)=='0')    //    s.endswith("0")
        {
            createAlternate_1(s+'0',i+1,n);
            createAlternate_1(s+'1',i+1,n);
        }else{
            createAlternate_1(s+'0',i+1,n);
        }

    }
}
