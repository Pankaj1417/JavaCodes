package DataStructures.Strings.Hard;
import java.util.*;
public class AdvancedAnagrams {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
          String s1 = s.nextLine();
          String s2 = s.nextLine();
          String s12 = s.nextLine();
       s1 = s1.concat(s2);
      Boolean isAnagram = isAnagram(s1,s12);
      if(isAnagram){
          System.out.println("yes");
      }else{
          System.out.println("No");
      }
        if (isInterleaved(s1,s2,s12) == true)
            System.out.printf("%s is interleaved of %s and %s", s12, s2, s1);
        else
            System.out.printf("%s is not interleaved of %s and %s", s12, s1, s2);
    }
    static Boolean isAnagram(String s1 ,String s2){
        Boolean isAnagram = true;
        char[] chars = new char[256];
        for(char ch : s1.toCharArray()){
            int index = (int)ch;
            chars[index]+=1;
        }
        for(char ch : s2.toCharArray()){
            int index = (int)ch;
            chars[index]-=1;
        }

        for(int i=0;i<256;i++){
            if(chars[i]!=0){
               isAnagram=false ;
               break;
            }
        }
        return isAnagram;
    }
    static boolean isInterleaved (String A, String B, String C)
    {
        int i = 0, j = 0, k = 0;

        // Iterate through all characters of C.
        while (k != C.length())
        {
            // Match first character of C with first character
            // of A. If matches them move A to next
            if (i<A.length()&&A.charAt(i) == C.charAt(k))
                i++;

                // Else Match first character of C with first
                // character of B. If matches them move B to next
            else if (j<B.length()&&B.charAt(j) == C.charAt(k))
                j++;

                // If doesn't match with either A or B, then return
                // false
            else
                return false;

            // Move C to next for next iteration
            k++;
        }

        // If A or B still have some characters,
        // then length of C is smaller than sum
        // of lengths of A and B, so return false
        if (i < A.length() || j < B.length())
            return false;

        return true;
    }
}
