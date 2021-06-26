package basicQuestions;

import java.util.Scanner;
public class matrix_operations {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the rows of matrix 1");
        int m = s.nextInt();
        System.out.println("Enter the cols of matrix 1");
        int n = s.nextInt();
        System.out.println("Enter the rows of matrix 2");
        int o = s.nextInt();
        System.out.println("Enter the cols of matrix 2");
        int p = s.nextInt();
        int[][] arr1 = new int[m][n];
        int[][] arr2 = new int[o][p];
        int[][] arr3 = new int[m][p];
        int i, j;
        if(n==o) {
        for (i = 0; i <m; i++) {
            for (j = 0; j < n; j++) {
                System.out.print("Enter the elements of array1 :");
                arr1[i][j] = s.nextInt();
            }
        }
        for (i = 0; i < o; i++) {
            for (j = 0; j < p; j++) {
                System.out.print("Enter the elements of array2 :");
                arr2[i][j] = s.nextInt();
            }
        }
            for (i = 0; i < m; i++) {
                for (int k = 0; k < p; k++) {
                    for (j = 0; j < n; j++) {
                        arr3[i][k] = arr1[i][j] * arr2[j][i] + arr3[i][k];
                    }
                }
            }

            for (i = 0; i < n; i++) {
                for (int k = 0; k < n; k++) {
                    System.out.print(arr3[i][k] + " ");
                }
                System.out.println("");
            }
        }
        else
        {
            System.out.println("Multiplication not possible");
        }
    }
}

