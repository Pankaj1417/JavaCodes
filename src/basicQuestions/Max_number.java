package basicQuestions;

import java.util.Scanner;
public class Max_number {
    public static void main(String[] args) {
        // this is the program which tells abt maximum number
        Scanner S = new Scanner(System.in);
        System.out.println("Enter FIRST Number");
        int a = S.nextInt();
        System.out.println("Enter SECOND Number");
        int b = S.nextInt();
        System.out.println("Enter THIRD Number");
        int c = S.nextInt();
//        if(a>b) {
//            if (a > c) {
//                System.out.println("Maximum number is " + a);
//            } else {
//                System.out.println("Maximum number is " + c);
//            }
//        }
//        if (b > a) {
//                if (b > c) {
//                    System.out.println("Maximum number is \"+ b");
//                } else {
//                    System.out.println("Maximum number is \"+ c");
//                }
//            }

        //USING TERNARY OPERATOR

        int result = a > c ? a > b ? a : b : c > b ? c : b;
        System.out.println(result);
    }
        }
