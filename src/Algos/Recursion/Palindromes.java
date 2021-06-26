package Algos.Recursion;
import java.util.ArrayList;
import java.util.Scanner;
public class Palindromes {
//    public static void main(String[]  args){
//        Scanner s = new Scanner(System.in);
//        int myNumber = s.nextInt();
////        String myString = String.valueOf(myNumber);
//        String myString  = "geeks";
//        System.out.println(isPalindrome(myString,0,myString.length()-1));
//        palindromePartition(myString);
//    }
//    static Boolean isPalindrome(String s,int i ,int j){
//        if(s.length()==0) return true;
//        if(i==j) return true;
//        if(s.charAt(i)!=s.charAt(j)) return false;
//        if(i<j){
//            return isPalindrome(s,i+1,j-1);
//        }
//        return true;
//    }
//    static void palindromePartition(String s){
//        ArrayList<String> al = new ArrayList<>();
//        for(int i=0;i<s.length();i++){
//            for(int j=i;j<s.length();j++){
//                if(isPalindrome(s,i,j)){
//                    al.add(s.substring(i,j+1));
//                }
//            }
//        }
//        if(al.contains(s)){
//            al.remove(s);
//        }
//        System.out.println(al);
//    }
    public static void main(String[] args){
        Scanner s = new Scanner (System.in);
        String myString = s.nextLine();
        char[] myCharArray = myString.toCharArray();
        boolean tell=true;
        tell = checkPalindromes(myCharArray,0,myCharArray.length-1,tell);
        if(tell){
            System.out.println("Yes");
        }else{
            System.out.println("NO");
        }

    }
    static boolean checkPalindromes(char[] ch , int i, int j,boolean tell){
        if(i<=j){
            if(ch[i]!= ch[j]){
                tell = false;
                return tell;
            }
            if(i<j){
                    checkPalindromes(ch,i+1,j-1,tell);
            }
        }
        return tell;
    }
}

