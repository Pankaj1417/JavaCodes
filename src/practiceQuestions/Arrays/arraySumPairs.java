//Given a array of integers and a number 'sum' find the number of pairs of integers in the array whose sum is equal to :"sum"



package practiceQuestions.Arrays;


import java.util.Scanner;
public class arraySumPairs {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of ARRAY :");
        int n = s.nextInt();
        System.out.println("Enter the sum you want for any pair");
        int k = s.nextInt();
        System.out.println("Enter the elements of ARRAY : ");
        int[] arr = new int[n];
        int i,j;
//       int count=0;
        for(i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        for(i=0;i<n-1;i++){
            for(j=i+1;j<n;j++){
                if(arr[i]+arr[j]==k){
//                    count++;
                    System.out.print(arr[i] + " "+ arr[j] +"  ");
                }
            }
        }
//       System.out.println(count);

    }
}
