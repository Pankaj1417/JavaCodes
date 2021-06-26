package CppCodingNinjas.BackTracking;
import java.util.Scanner;


public class NqueenProb {
    static void placeNQueens(int n){
        int[][] chessBoard = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                chessBoard[i][j] = 0;
            }

        }
        nQueensHelper(n,0,chessBoard);
        }
        static void nQueensHelper(int n , int row , int[][] board){
            if(row==n){
               for(int i=0;i<n;i++){
                   for(int j=0;j<n;j++){
                       System.out.print(board[i][j]+" ");
                   }
               }
                System.out.println();
               return;
            }
            for(int j=0;j<n;j++){
                if(isPossible(n,row,j,board)){
                    board[row][j] = 1;
                    nQueensHelper(n,row+1,board);

                    board[row][j] = 0;
                }
            }
        }

    static Boolean isPossible(int n , int row ,int column,int[][] board){
      for(int i=row-1;i>=0;i--){
          for(int j=column-1;j>=0;j--){
              if(board[i][j]==1){
                  return false;
              }
          }
      }
      for(int i=row-1;i>=0;i--){
          for(int j=column+1;j<n;j++){
              if(board[i][j]==1){
                  return false;
              }
          }
      }
      for(int j=row-1;j>=0;j--){
          if(board[j][column]==1){
              return false;
          }
      }
      return true;
    }

    public static void main(String[] args){
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
           placeNQueens(n);
        }

}
