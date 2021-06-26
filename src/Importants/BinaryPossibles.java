package Importants;

import java.util.Scanner;

public class BinaryPossibles {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k=n;
        subStringWithoutConsecutiveOnes(n,"1",k);


    }
          static void subStringWithoutConsecutiveOnes(int n,String s,int k){
            if(s.length()==n||n<0) return ;
//            if(s == null){
//                subStringWithoutConsecutiveOnes(n-1,s.concat("0"),k);
//                subStringWithoutConsecutiveOnes(n-1,s.concat("1"),k);
//            }
            if(s.charAt(s.length()-1)==1){
                subStringWithoutConsecutiveOnes(n-1,s.concat("0"),k);
            }else{
                subStringWithoutConsecutiveOnes(n-1,s.concat("0"),k);
                subStringWithoutConsecutiveOnes(n-1,s.concat("1"),k);
            }
              System.out.println(s);
            }
        }
