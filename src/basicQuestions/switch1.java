package basicQuestions;

import java.util.Scanner;
public class switch1 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
//        System.out.println("ENTER THE OPERATION YOU WANT TO PERFORM");
//        System.out.println("Enter 1 for '+' " +
//                "Enter 2 for '-' " +
//                "Enter 3 for '*' " +
//                "Enter 4 for '/' ");
//
//        int operation = s.nextInt();
//
//        System.out.println("ENTER THE NUMBER1");
//        float num1 = s.nextFloat();
//        System.out.println("ENTER THE NUMBER2");
//        float num2 = s.nextFloat();
//        switch(operation){
//            case 1 :
//                float sum = num1+num2;
//                System.out.println("Sum of these numbers is" +sum);
//                break;
//            case 2:
//                float diff = num1-num2;
//                System.out.println("Difference of these numbers is" +diff);
//                break;
//            case 3:
//                float product = num1*num2;
//                System.out.println("Product of these numbers is" + product);
//                break;
//          case 4:
//                float fraction = num1/num2;
//                System.out.println("fraction of these numbers is" + fraction);
//                break;
//            default:
//                System.out.println("Invalid operation");
//        }

        System.out.println("ENTER THE OPERATION YOU WANT TO PERFORM");
//        System.out.println("Enter 1 for '+' " +
//                "Enter 2 for '-' " +
//                "Enter 3 for '*' " +
//                "Enter 4 for '/' ");

        char operation = s.nextLine().charAt(0);
        System.out.println("ENTER THE NUMBER1");
        float num1 = s.nextFloat();
        System.out.println("ENTER THE NUMBER2");
        float num2 = s.nextFloat();
        switch(operation){
            case '+' :
                float sum = num1+num2;
                System.out.println("Sum of these numbers is" +sum);
                break;
            case '-':
                float diff = num1-num2;
                System.out.println("Difference of these numbers is" +diff);
                break;
            case '*':
                float product = num1*num2;
                System.out.println("Product of these numbers is" + product);
                break;
            case '/':
                float fraction = num1/num2;
                System.out.println("fraction of these numbers is" + fraction);
                break;
            default:
                System.out.println("Invalid operation");
        }


    }
}
