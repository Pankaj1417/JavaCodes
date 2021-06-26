package DataStructures.Arrays;

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args){
        Scanner s = new Scanner (System.in);
        System.out.println("Enter the rows and columns of first matrix");
        int row1 =s.nextInt();
        int col1 =s.nextInt();
        System.out.println("Enter the rows and columns of second matrix");
        int row2 =s.nextInt();
        int col2 =s.nextInt();
        int [][]array1 = new int [row1][col1];
        int [][]array2 = new int [row2][col2];
        int [][]array3 = new int [row1][col2];
        System.out.println("Enter the elements of array 1");
        for(int i=0;i<row1;i++){
            for(int j=0;j<col1;j++)
            {
                array1[i][j] = s.nextInt();
            }
        }
        System.out.println("Enter the elements of array 2");
        for(int i=0;i<row2;i++){
            for(int j=0;j<col2;j++)
            {
                array2[i][j] = s.nextInt();
            }
        }
        matrixMultiplication(array1,array2,array3,row1,col1,row2,col2);
        for(int i=0;i<row2;i++){
            for(int j=0;j<col2;j++)
            {
                System.out.print(array3[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int[][] matrixMultiplication(int[][]a1,int[][]a2,int[][] a3,int row1,int col1,int row2,int col2){
        if(col1==row2){
             for(int i=0;i<col2;i++){
                 for(int j=0;j<row1;j++){
                     for(int k=0;k<col2;k++){
                         a3[i][j] = a1[j][k]*a2[k][j] +a3[i][j];
                     }
                 }
             }
        }
        else{
            System.out.println("Multiplication not possible");
        }
        return a3;
    }
}
