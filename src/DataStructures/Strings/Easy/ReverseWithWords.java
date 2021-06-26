package DataStructures.Strings.Easy;
import java.util.*;
public class ReverseWithWords {
    public static void main(String[] args){
       Scanner s = new Scanner(System.in);
       String myStr = s.nextLine();
       int i = myStr.length()-1;
       String ans = "";
       while(i >= 0){
           while(i>=0 && myStr.charAt(i)==' ') {
               i--;
           }
           int j = i;
           if(i<0) break;
           while(i>=0 && myStr.charAt(i)!=' '){
               i--;
           }
           if(ans.isEmpty()) {
               ans = ans.concat(ans.substring(i+1, j+1));
           }
           else{
               ans = ans.concat(" "+ ans.substring(i+1,j+1));
           }

       }
        System.out.println(ans);
      }
    }

