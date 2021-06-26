package DataStructures.Strings;

import java.util.Scanner;

public class StringWithAdjacentDifferents {
    public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int t =s.nextInt();
        while(t-->0) {
            String myString = s.nextLine();
            char[] allCharacters = myString.toCharArray();
            for (int i = 0; i < myString.length() - 1; i++) {
                if (allCharacters[i] == allCharacters[i + 1]) {
                    int j = i + 1;
                    while (allCharacters[i + 1] == allCharacters[j]) {
                        j++;
                    }
                    char temp = allCharacters[j];
                    allCharacters[j] = allCharacters[i + 1];
                    allCharacters[i + 1] = temp;
                }
            }
            for (int i = myString.length() - 2; i > 2; i--) {
                if (allCharacters[i] == allCharacters[i - 1]) {
                    int j = i - 1;

                    
                    while (allCharacters[i - 1] == allCharacters[j]) {
                        j--;
                    }
                    char temp = allCharacters[j];
                    allCharacters[j] = allCharacters[i - 1];
                    allCharacters[i - 1] = temp;
                }
            }
            for (int i = 0; i < myString.length() - 1; i++) {
                if (myString.charAt(i) != myString.charAt(i + 1)) {
                    System.out.println("1");
                } else {
                    System.out.println("0");
                }
            }
        }
    }
}
