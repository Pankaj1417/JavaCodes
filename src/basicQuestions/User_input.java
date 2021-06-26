package basicQuestions;

import java.util.Scanner;
public class User_input {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("this is program that takes user input");
        System.out.println("Enter first number");
        float a = s.nextFloat();
        System.out.println("Enter second number");
        float b = s.nextFloat();
        float sum = a+b;
        System.out.print("the sum of numbers is : ");
        System.out.println(sum);




    }
}
