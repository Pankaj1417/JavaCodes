package oops;
import java.util.*;
import java.lang.*;

public class main {
//    public static void main(String[] args){
//        Teacher t = new Teacher();
//        t.name = "pankaj kumar";
//        t.eat();
//        t.walk();
//        t.teach();
//        Singer s = new Singer();
//        s.name = "pankaj";
//        s.sing();
//        s.love();


    //class GFG {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        while (t > 0) {
            System.out.println("Enter the size of array");
            int n = s.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter the sum of array you want");
            int s1 = s.nextInt();
            System.out.println("Enter the elements of array");
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }

            int sum=0,i,j;
            int v1 = 0;
            for (i = 0; i < n; i++) {
                sum = arr[i];
                for (j=i+1; j<n; j++) {
                    sum = sum + arr[j];
                    if (sum > s1 || j==n) {
                        break;
                    }
                    else if (sum == s1) {
                        System.out.println(i + " " +j);
                        v1 = 1;
                        break;

                    }
                }
            }
            if(v1!=1){
                System.out.println("-1");
            }
            t--;
        }
    }
}
