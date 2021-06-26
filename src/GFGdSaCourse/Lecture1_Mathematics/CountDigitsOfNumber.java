package GFGdSaCourse.Lecture1_Mathematics;

import java.util.Scanner;

public class CountDigitsOfNumber {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int digitscount = (int) Math.log10(num) +1;
        System.out.println(digitscount);
    }


}
