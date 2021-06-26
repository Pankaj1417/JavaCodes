package Algos.BackTracking;

public class NqueenProblems {
   public static void main(String[] args){
       char[][] chessBoard = new char[8][8];
       char[] queens = new char[8];
   }
   static Boolean underAttack(char[][] chessBoard){
       return !sameColumn(chessBoard) && !sameRow(chessBoard) && !sameDiagonal(chessBoard);
   }
   static Boolean sameColumn(char[][] chessBoard){
      for(int i=0;i<8;i++){
          for(int j=0;j<8;j++){

       }
     }
      return false;
   }
   static Boolean sameRow(char[][] chessBoard ){

       return false;
   }
   static Boolean sameDiagonal(char[][] chessBoard){

       return false;
   }
}
