package DataStructures.Strings.Hard;

import java.util.Scanner;

public class IsRAoatedString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        String s2 = s.nextLine();
        String temp = s1.concat(s1);
        boolean isSubString = false;
        for (int i = 0; i < s1.length(); i++) {
            if (s2.equals(temp.substring(i,i+s2.length()))){
                isSubString = true;
                break;
            }
        }
        if(isSubString){ System.out.println("yes");}
        else {System.out.println("no");}
    }
}
