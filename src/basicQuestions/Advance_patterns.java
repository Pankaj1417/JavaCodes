package basicQuestions;

import java.util.Scanner;
public class Advance_patterns {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of rows you want");
        int rows = s.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=2*rows;j++){
                if(j<=rows+i-1&&j>=rows+1-i){
                    if((j%2==0&&i%2!=0)|(i%2==0&&j%2!=0)){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }

        //PATTERN 2

//        for (int i=1;i<8;i++){
//            if(i<=4){
//            for(int j=1;j<=i;j++){
//                System.out.print("* ");
//            }
//            }
//            else{
//                for(int j=1;j<=8-i;j++){
//                    System.out.print("* ");
//                }
//            }
//            System.out.println();
//        }


           //PATTERN3

//        for(int i=1;i<=rows;i++){
//            for(int j=1;j<=rows;j++){
//                if(j==1|i==rows|j==i){
//                    System.out.print("*");
//                }
//                else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println("");
//        }

    }
}
