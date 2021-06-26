package basicQuestions;

import java.util.Scanner;
public class Matrix_Addition {
    public static void main(String[] args){
        Scanner s = new Scanner (System.in);
        System.out.println("Enter the number of rows of matrix1");
        int m = s.nextInt();
        System.out.println("Enter the number of columns of matrix2");
        int n = s.nextInt();
        System.out.println("Enter the number of rows of matrix2");
        int o = s.nextInt();
        System.out.println("Enter the number of columns of matrix2");
        int p = s.nextInt();
        int a[][]=new int[m][n];
        int b[][]=new int[o][p];
        int c[][]=new int[m][n];
        if(m==o&&n==p){
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    System.out.println("Enter the elements of matrix 1");
                    a[i][j] = s.nextInt();
                }
            }
            for(int i=0;i<o;i++) {
                for (int j = 0; j < p; j++) {
                    System.out.println("Enter the elements of matrix 2");
                    b[i][j] = s.nextInt();
                }
            }
                    for(int i=0;i<o;i++){
                for(int j=0;j<p;j++){
                    c[i][j] = c[i][j]+a[i][j]+b[i][j];
                }
            }
                    for(int i=0;i<o;i++){
                for(int j=0;j<p;j++){
                    System.out.print(c[i][j] +" ");
                }
                        System.out.println("");
            }
        }
        else
        {
            System.out.println("Matrix addition is not possible");
        }
    }
}
