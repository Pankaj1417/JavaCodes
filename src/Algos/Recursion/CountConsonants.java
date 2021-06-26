package Algos.Recursion;
import java.util.*;
public class CountConsonants {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String myString = s.nextLine();
       consonantCounts(myString,0,0);
    }
    static void consonantCounts(String s, int i,int count){
        if(i==s.length()){
            System.out.println(count);
            return;
        }
        if(s.charAt(i)==('a')||s.charAt(i)==('e')||s.charAt(i)==('i')||s.charAt(i)==('o')||
                s.charAt(i)==('u')||s.charAt(i)==' '){
            consonantCounts(s,i+1,count);
        }else{
            consonantCounts(s,i+1,count+1);
        }

    }
}
