package basicQuestions;

import java.util.Scanner;
public class Marks_Percentage {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("You can calculate your percentage here");
        System.out.println("Enter marks you get in Maths");
        float maths_marks = s.nextFloat();
        System.out.println("Enter marks you get in English");
        float Eng_marks = s.nextFloat();
        System.out.println("Enter marks you get in Hindi");
        float Hin_marks = s.nextFloat();
        System.out.println("Enter marks you get in Science");
        float Sci_marks = s.nextFloat();
        System.out.println("Enter marks you get in Social science");
        float Social_marks = s.nextFloat();
        float percent = ((maths_marks+ Eng_marks+Hin_marks+Sci_marks+Social_marks)/5);
        System.out.print("your overall percentage is :");
        System.out.println(percent);




    }
}
