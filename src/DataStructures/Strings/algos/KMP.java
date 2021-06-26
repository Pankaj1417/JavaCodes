package DataStructures.Strings.algos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KMP {
   static List<Integer> list = new ArrayList<>();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Text String");
        String txt = sc.next();
        System.out.println("Enter Pattern String");
        String ptrn = sc.next();
        int[] pi = createPi(ptrn.toCharArray());
       for(int i :pi){
           System.out.print(i + " ");
       }

        System.out.println();

        System.out.println(KMPSearch(txt.toCharArray(),ptrn.toCharArray(),pi));
    }
   static Boolean searchPattern(char[] text , char[] patt , int[] pi){
        int i =0;
        int j =0;
        while (i < text.length){
            if(text[i] == patt[j]){
                i++;
                j++;
            }else{
                if(j!= 0){
                    j = pi[j-1];
                }else{
                    i++;
                }
            }
            if(j == patt.length){
                return true;
            }
        }
        return j == patt.length;
   }

   static boolean KMPSearch( char[] txt, char[] pat, int[] lps)
    {
        int M = pat.length;
        int N = txt.length;


        int j = 0; // index for pat[]


        int i = 0; // index for txt[]
        while (i < N) {
            if (pat[j] == txt[i]) {
                j++;
                i++;
            }
            if (j == M) {
               list.add(i-j);
                j = lps[j - 1];
                return true;
            }

            // mismatch after j matches
            else if (i < N && pat[j] != txt[i]) {
                if (j != 0)
                    j = lps[j - 1];
                else
                    i = i + 1;
            }
        }
        return false;
    }
   static int[] createPi(char[] pat){
        int[] pi = new int[pat.length];
        pi[0] = 0;
        int j =0;
        int i = 1;
        while (i<pat.length){
            if(pat[i] == pat[j]){
                pi[i] = j+1;
                j+=1;i+=1;
            }
            else{
                if(j!=0){
                    j = pi[j-1];
                }else{
                    pi[i] = 0;
                    i+=1;
                }
            }
        }
        return pi;
    }
    
}

