package basicQuestions;
// Java Code to sort 2D Matrix
// according to any Column
import java.util.*;
import java.util.Arrays;

class sort2DMatrixbycolumn {

    // Function to sort by column
    public static void sortbyColumn(int[][] arr, int col)
    {
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[col], o2[col]);
            }
        });
    }

    // Driver Code
    public static void main(String args[])
    {
        int matrix[][] = { { 39, 27, 11, 42 },
                { 10, 93, 91, 90 },
                { 54, 78, 56, 89 },
                { 24, 64, 20, 65 } };
        // Sort this matrix by 3rd Column
        int col = 3;
        sortbyColumn(matrix, col - 1);

        // Display the sorted Matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
    }
}
