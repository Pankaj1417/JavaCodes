package basicQuestions;

import java.util.Scanner;
public class Factorialofnum {
    public static void main(String[] args) {
        //THIS IS THE PROGRAM TO FIND FACTORIAL OF NUMBER
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for which you want to calculate the factorial of number");
        int num = sc.nextInt();
        for(int i=num-1;i>0;i--){
            num=num*i;
        }
        System.out.println("Factorial of entered number is "+num);
    }
}
