package DataStructures.Strings.Easy;

import java.util.Scanner;

public class REverseString {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        String mySring = s.nextLine();
        char[] chars = mySring.toCharArray();
        int i=0,j=mySring.length()-1;
        char temp;
        while(i<j){
            temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }
        System.out.println(chars);
       chars.toString();
        System.out.println(chars);
        }
    }

