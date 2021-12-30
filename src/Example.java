import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Example {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        int x = s.nextInt();
        while (x>=0){
            al.add(x);
            x = s.nextInt();
        }
        for(int item : al){
            System.out.println(item);
        }
        System.out.println();
        int[] arr = {1,2,3,4,5,6,7,8,9,11};
        int x1 = Arrays.binarySearch(arr,11);
        System.out.println(x1);
    }
}
