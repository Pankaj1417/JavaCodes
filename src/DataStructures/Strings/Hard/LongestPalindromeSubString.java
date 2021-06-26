package DataStructures.Strings.Hard;

import java.util.Scanner;

public class LongestPalindromeSubString {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String myString = s.nextLine();
        }
        static int isPAlindromeSubString(String s){
        int maxPalindromeLength =0;
        if(s.length()==0) return 0;
        if(s.length()==1) return 1;
        if(s.length()==2&&s.charAt(0)==s.charAt(1)) return 2;
        int i=1,j=1;
        while(i<s.length()-1&&j<s.length()-1&&i>0&&j>0){
            if(s.charAt(i)==s.charAt(i+1)){
                maxPalindromeLength+=2;
                j = i+1;
                if(s.charAt(i+1)==s.charAt(j+1)){
                      maxPalindromeLength+=2;
                    j++;
                    i++;
                }else{
                    i++;
                    j++;

                }
            }
            if(s.charAt(i)!=s.charAt(i+1)){
                if(s.charAt(i-1)==s.charAt(i+1)){
                    maxPalindromeLength+=1;
                    i--;
                    j++;
                    if(s.charAt(i)==s.charAt(j)){
                       return maxPalindromeLength+=2;
                    }
                }else{

                }
            }
        }
        return  maxPalindromeLength;
        }

    }