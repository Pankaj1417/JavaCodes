package DataStructures.Strings.Hard;

import java.util.*;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String myString = s.nextLine();
        removeDuplicates(myString);
        System.out.println();
        uniqueCharcters(myString);
    }
//     IF ORDER OR SEQUENCE IS IMPORTANT FOR YOU GUYS
    static void removeDuplicates(String s){
        Set<Character> set = new HashSet<>();
        for(char ch : s.toCharArray()){
            set.add(ch);
        }
        for(Character ch : set){
            System.out.print(ch);
        }
    }
    //     IF ORDER OR SEQUENCE IS NOT IMPORTANT FOR YOU GUYS

    static void uniqueCharcters(String s){
        int i;
        String newString ="";
        for(i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(newString.indexOf(ch)<0){
                newString = newString+ch;
            }
        }
        System.out.println(newString);
    }
}
