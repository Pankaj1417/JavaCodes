package DataStructures.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class HCFOfNumbers {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        System.out.println(hcfOfTwoNumbers(n1,n2));
    }
    static int hcfOfTwoNumbers(int n1,int n2){
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=1;i<=Math.min(n1,n2);i++){
            if((n1%i==0)&&(n2%i==0)) al.add(i);
        }
        return al.get(al.size()-1);
    }
}
