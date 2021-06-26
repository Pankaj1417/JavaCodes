package basicQuestions;

import java.util.Scanner;
public class Series__Sum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of n ");
        int n = s.nextInt();
        float i;
        float sum=1f;
        for(i =1; i<=n;i++){
         if(i%2==0){
               sum = sum - 1/i;
            }
         else{
            sum=sum+1/i;
         }
        }
        System.out.println(sum);
    }
}
