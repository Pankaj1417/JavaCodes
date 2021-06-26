package DataStructures.Strings.Easy;
import java.util.Scanner;

public class CheckAnagrams {
    public static void main(String[] args){
        Scanner s  = new Scanner (System.in);
        String myString1 = s.nextLine();
        String myString2 = s.nextLine();
        Boolean isAnagram = isAnagram(myString1,myString2);
        if(isAnagram){

            System.out.println("these are anagrams");
        }else{
            System.out.println("these are not anagrams");
        }
    }
            public static Boolean isAnagram(String s1,String s2){
              Boolean isAnagram = false;
              int[] visited = new int[s1.length()];
              if(s1.length()!=s2.length()){
                 return isAnagram;
              }
              for(int i=0;i<s1.length();i++){
                  isAnagram =false;
                  for(int j=0;j<s2.length();j++) {
                          if ((s1.charAt(i) == s2.charAt(j))&&(visited[j]!=-1)) {
                              isAnagram = true;
                              visited[j] = -1;
                              break;
                          }else{
                              isAnagram = false;
                          }
                      }
                  if(!isAnagram) break;
                  }
              return isAnagram;
             }
      }

