package DataStructures.Strings.Easy;

import java.util.*;
public class duplicateCharacters {
    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            String mySring = s.nextLine();
            mySring = mySring.replace(" ", "");
        Set<Character> charset = new HashSet<>();
        Set<Character> charset2 = new HashSet<>();
            for(char ch : mySring.toCharArray()){
                if(charset.contains(ch)){
                    charset2.add(ch);
                } else {
                    charset.add(ch);
                }
            }
        System.out.print(charset2);
        }
    }

