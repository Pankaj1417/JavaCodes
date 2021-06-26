package Algos.Recursion;
import java.util.*;
public class firstCapital {
   public static void main(String[] args){
       Scanner s = new Scanner (System.in);
       String myString = s.nextLine();
       firstUppaerCase(myString,0);
       first(myString,0);

   }
   static void firstUppaerCase(String s ,int i){
       if(i==s.length()){
           return;
       }
       if((int)s.charAt(i)<=90&&(int)s.charAt(i)>=65){
           System.out.println(s.charAt(i));
           return;
       }
       firstUppaerCase(s,i+1);
   }
    static char first(String str, int i)
    {
        if (str.charAt(i) == '\0')
            return 0;
        if (Character.isUpperCase(str.charAt(i)))
            return str.charAt(i);
        return first(str, i + 1);
    }
}
