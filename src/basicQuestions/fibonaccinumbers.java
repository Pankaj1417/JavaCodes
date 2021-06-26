package basicQuestions;

import java.util.Scanner;
public class fibonaccinumbers {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter how many times you want to print fibonacci numbers");
        int seq = s.nextInt();
        int i;
        int x=0,y=1,z=1;
        System.out.print(x+" " );
        System.out.print(y+" " );
        System.out.print(z+" " );

        for(i=0;i<seq-3;i++){
            x=y;
            y=z;
            z=x+y;
            System.out.print(z + " ");
        }

    }
}
