package GFGdSaCourse.Lecture1_Mathematics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SieveOfErosteness_Factorials {
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        int aa = 7;
        int num = s.nextInt();
        ArrayList<Integer> myAl = new ArrayList<>();
        getAllPrimes(myAl,num);
        System.out.println(myAl);

    }
    static ArrayList<Integer> getAllPrimes(ArrayList<Integer> al,int num){
        Boolean [] myBool = new Boolean[num+1];
        Arrays.fill(myBool,true);
        for(int i=2;i<=num;i++){
            if(myBool[i]){
                al.add(i);
                int k = 1;
                for(int j=i;j<=num;j=j*k){
                    k++;
                    myBool[j] = false;
                }
            }
        }
       return al;
    }
}
