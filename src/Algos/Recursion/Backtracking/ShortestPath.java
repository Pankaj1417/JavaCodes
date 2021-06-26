package Algos.Recursion.Backtracking;

public class ShortestPath {
public static void main(String[] args){
    int [][] a ={{1,1,1,1,1,2,2,2,1,},
                {2,2,2,1,1,2,1,2,1,},
                {2,1,1,2,1,2,1,2,2,},
                {2,2,2,1,2,2,1,1,2,},
                {1,1,2,1,1,2,2,2,2,},
                {1,1,2,2,2,2,1,2,1,}};
    int rows = a.length;
    int cols = a[0].length;
    boolean[][] vis = new boolean[rows][cols];
    int path  = shortestPath(a,1 ,1,5 ,5,vis);
    System.out.println(path);
   }
  static boolean isValid(int [][]a,int i,int j,boolean vis[][]){
      int rows = a.length;
      int cols = a[0].length;
    return i<rows&&i>=0&&j<cols&&j>=0&&!vis[i][j]&&a[i][j]==2;
  }
   static int shortestPath(int[][]a , int i,int j, int x, int y,boolean vis[][]){
      if(!isValid(a,i,j,vis)) {
          return 100000000;
      }
       if(i==x&&j==y){
           return 0;
       }
       vis[i][j] = true;
       int left = shortestPath(a,i,j-1,x,y,vis)+1;
       int right = shortestPath(a,i,j+1,x,y,vis)+1;
       int top = shortestPath(a,i-1,j,x,y,vis)+1;
       int bottom = shortestPath(a,i+1,j,x,y,vis)+1;
       vis[i][j] = false;
       return Math.min(Math.min(left,right),Math.min(top,bottom));
}
}

