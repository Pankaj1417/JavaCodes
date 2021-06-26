package basicQuestions;

import java.util.Scanner;
public class araisetopowerb {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = s.nextInt();
        System.out.println("Enter the power of entered number");
        int b = s.nextInt();
        int i;
        int result=1;
        for(i=0;i<b;i++){
             result= result*a;
        }
        System.out.println("desired result is "+ result);

    }
}
