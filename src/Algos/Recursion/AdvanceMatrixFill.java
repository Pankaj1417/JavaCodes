package Algos.Recursion;
public class AdvanceMatrixFill {
    public static void main(String[] args){
            int [][] a ={{1,1,1,1,1,2,2,2,1,},
                         {2,2,2,1,1,2,1,2,1,},
                         {2,1,1,2,1,2,1,2,2,},
                         {2,2,2,1,2,2,1,1,2,},
                         {1,1,2,1,1,2,2,2,2,},
                         {1,1,2,2,2,2,1,2,1,}};
        colorFill(a ,3 ,5 , 2 ,3);
        printMatrix(a);

    }
    static void colorFill(int[][] a,int r, int c, int prev_fill, int net_fill){
        int row=a.length ;
        int col=a[0].length;
        if(r<0||r>=row||c<0||c>=col){
            return;
        }
        if(a[r][c]!=prev_fill){
            return;
        }
        a[r][c] = net_fill;
        colorFill(a,r-1,c,prev_fill,net_fill);
        colorFill(a,r,c-1,prev_fill,net_fill);
        colorFill(a,r,c+1,prev_fill,net_fill);
        colorFill(a,r+1,c,prev_fill,net_fill);

    }
    static void printMatrix(int a[][]){
        int i,j;
        for(i=0;i<a.length;i++){
            for(j=0;j<a[0].length;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
