package DataStructures.Strings.Easy;

import java.util.Scanner;

public class CheckPalindromes {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String myString1 = s.nextLine();
        String myString2 = s.nextLine();
        if(myString1.length() != myString2.length()){
            System.out.println("These are not palindromes");
            return;
        }
        Boolean isPalindrome = true;
        int i=0,j=myString1.length()-1;
        while(i<myString1.length()&&j>=0){
            if(myString1.charAt(i) != myString2.charAt(j)){
                isPalindrome =false;
                break;
            }
            i++;
            j--;
        }
        if(isPalindrome){
            System.out.println("these are palindromes");
        }else{
            System.out.println("these are not palindromes");
        }
    }
}
