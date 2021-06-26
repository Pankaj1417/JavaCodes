package CppCodingNinjas.BackTracking;
import java.util.Scanner;
public class RatInMaze {
    public static void main(String[] args){
           Scanner s = new Scanner(System.in);
           int n = s.nextInt();
           int[][] maze = new int[n][n];
           int[][] out = new int[n][n];
           for(int i=0;i<n;i++){
               for (int j=0;j<n;j++){
                   maze[i][j] = s.nextInt();
               }
           }
           ratInMaze(maze,out,0,0,n);
    }
    static void printhPath(int[][] arr,int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    static void ratInMaze(int[][] maze , int[][] out, int row , int col,int n) {
        if(maze[0][0] == 0) System.out.println("No path");
        if(maze[n-1][n-1] == 0) System.out.println("No path");
          if(row == n-1&&col == n-1){
               out[row][col] = 1;
               printhPath(out,n);
          }
          if(row<0||row>=n||col<0||col>=n||out[row][col] == 1) return;
          out[row][col] = 1;
        ratInMaze(maze,out,row-1,col,n);
        ratInMaze(maze,out,row,col+1,n);
        ratInMaze(maze,out,row+1,col,n);
        ratInMaze(maze,out,row,col-1,n);
        out[row][col] = 0;
    }
}
