package gameTheory;

import java.util.Random;
import java.util.Scanner;

public class RPS {
   static int x = 0;
    static int y = 0;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] arr = {"Rock" , "Paper" , "Scissor"};
        System.out.print("Available Choices are : ");
        for(int i=0;i<3;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
        System.out.println("Enter number of times you want to play game ");
        int n = s.nextInt();
        while(n-- > 0){
            Random random = new Random();
            int number = random.nextInt(2);
            String system = arr[number];
            System.out.println("Enter your choice");
            String user = s.next();
            game(user,system);
        }
        System.out.println("You win "+x+" number of times");
        System.out.print("System win "+y+" number of times");
    }
    static void game(String s1 , String s2){
        if(s1.equals("Rock")){
            if(s2.equals("Rock")){
                System.out.println("You choose "+s1 +" and System choose "+s2);
                System.out.println("Tie");
            }else if(s2.equals("Paper")){
                System.out.println("You choose "+s1 +" and System choose "+s2);
                System.out.println(" You Loose");
                y++;
            }else{
                System.out.println("You choose "+s1 +" and System choose "+s2);
                System.out.println("You Win");
                x++;
            }
        }else if(s1.equals("Paper")){
            if(s2.equals("Rock")){
                System.out.println("You choose "+s1 +" and System choose "+s2);
                System.out.println("You Win");
                x++;
            }else if(s2.equals("Paper")){
                System.out.println("You choose "+s1 +" and System choose "+s2);
                System.out.println("Tie");
            }else{
                System.out.println("You choose "+s1 +" and System choose "+s2);
                System.out.println("You Loose");
                y++;
            }
        }else{
            if(s2.equals("Scissor")){
                System.out.println("You choose "+s1 +" and System choose "+s2);
                System.out.println("Tie");
            }else if(s2.equals("Rock")){
                System.out.println("You choose "+s1 +" and System choose "+s2);
                System.out.println(" You Loose");
                y++;
            }else{
                System.out.println("You choose "+s1 +" and System choose "+s2);
                System.out.println("You Win");
                x++;
            }
        }
    }
}
