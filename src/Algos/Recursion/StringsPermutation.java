package Algos.Recursion;
import java.util.*;
public class StringsPermutation {
   static Set<String> set = new HashSet<>();
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();
   permutations(s,0,s.length()-1);

    }
    static void permutations(String s , int l , int r){

        if(l ==r ){
            if(set.contains(s)) return;
            set.add(s);
            System.out.println(s);
            return;
        }
        int i;
        for(i=l;i<=r;i++){
            s = interchange(s,l,i);
            permutations(s, l+1,r);
            s = interchange(s,l,i);
        }
    }
    static String interchange(String s , int a ,int b){
        char [] array = s.toCharArray();
        char temp = array[b];
        array[b] = array[a];
        array[a] = temp;
        return String.valueOf(array);
    }
}
