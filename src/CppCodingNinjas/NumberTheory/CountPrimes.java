package CppCodingNinjas.NumberTheory;

import java.util.Arrays;
import java.util.Scanner;

public class CountPrimes {
    public static void main(String[] args) {
        int[] arr = {5,4,1,4,1,3,5,2};
        int temp =0;
        for (int j : arr) {
            temp ^= j;
        }
        int count =0;
        int temp1 = temp;
        while((temp1 & 1) != 1){
            count++;
           temp1 =  temp1 >> 1;
        }
        int mask = 1<<count;
        temp1 = temp;
        for (int j : arr) {
            if ((mask & j) == 1) {
                temp1 ^= j;
            }
        }
        System.out.println(temp1);
        System.out.println(temp1^temp);

    }
}

