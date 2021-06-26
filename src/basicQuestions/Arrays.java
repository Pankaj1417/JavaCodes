package basicQuestions;

import java.util.Scanner;
public class Arrays {
    public static void main(String[] args0) {
        Scanner s = new Scanner(System.in);
        System.out.println("This is our first array based program");
        int i;
        int[] marks1 = new int[7];
        int[] marks2 = new int[7];
        int []marks3= new int[7];
        for (i = 0; i <= 6; i++) {
            System.out.println("Please enter marks for array1 at index " + i);
            marks1[i] = s.nextInt();
        }
        for (i = 0; i <= 6; i++) {
            System.out.println("Please enter marks for array2 at index " + i);
            marks2[i] = s.nextInt();
        }
        for (i = 0; i <= 6; i++) {
            marks3[i] = marks1[i]+marks2[i];
        }
        for (i = 0; i <= 6; i++) {
            System.out.println(marks3[i] );
        }
    }
}
