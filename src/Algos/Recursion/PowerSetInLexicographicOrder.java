package Algos.Recursion;
import java.util.*;
public class PowerSetInLexicographicOrder {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String myString = s.nextLine();
        char [] charArray = myString.toCharArray();
        Arrays.sort(charArray);
        powerSetOfString(new String(charArray),-1,"",myString.length());
    }
     static void powerSetOfString(String s,int index,String toAdd,int n){
        if(index==n){
            return;
        }
         System.out.print(toAdd+" ");
        for(int i=index+1;i<n;i++){

            toAdd = toAdd+ s.charAt(i);
            powerSetOfString(s,i,toAdd,n);

            toAdd = toAdd.substring(0, s.length()-1);
        }
     }
}