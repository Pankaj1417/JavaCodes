package practiceQuestions.Arrays;
import java.io.*;
import java.util.*;

public class MatchingStrings {

    // Complete the arrayManipulation function below.
    static int arrayManipulation(int n, int[][] queries) {
        int i,j;
        int [] arr = new int[n];
        if(queries==null) return 0;
        Arrays.fill(arr,0);
        for(i=0;i<queries.length;i++) {
            for (j = 0; j < n; j++) {
                int a = queries[i][0];
                int b = queries[i][1];
                int k = queries[i][2];
                if (j + 1 >= k && j + 1 <= b) {
                    arr[j] = arr[j] + k;
                }
            }
        }
        Arrays.sort(arr);
        return arr[n-1];
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[][] queries = new int[m][3];

        for (int i = 0; i < m; i++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowItems[j]);
                queries[i][j] = queriesItem;
            }
        }

        int result = arrayManipulation(n, queries);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
