package basicQuestions;

import java.util.Scanner;
public class conditionalstatements {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter your age");
        int age = s.nextInt();
        if (age <= 18) {
            System.out.println("you are under aged");
        }
        else if (age > 18 && age < 56) {
            System.out.println("you are not eligible for job");
        } else
            System.out.println("please take retirement");
    }

    }