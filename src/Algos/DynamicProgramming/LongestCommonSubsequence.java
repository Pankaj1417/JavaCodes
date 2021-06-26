package Algos.DynamicProgramming;

import java.util.Scanner;

public class LongestCommonSubsequence {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String myString1 = s.nextLine();
        String myString2 = s.nextLine();
      int sunSequence =  longestCommonSubsequence(myString1,myString2,0,0);
        System.out.println(sunSequence);

    }
    static int longestCommonSubsequence(String s1,String s2,int i, int j){
       if(i == s1.length()||j == s2.length()){
           return 0;
       }
       else if(s1.charAt(i) == s2.charAt(j)){
           return (1+longestCommonSubsequence(s1,s2,i+1,j+1));

       }
       else{
           return Math.max(longestCommonSubsequence(s1,s2,i,j+1),
                   longestCommonSubsequence(s1,s2,i+1,j));
       }
    }
}
