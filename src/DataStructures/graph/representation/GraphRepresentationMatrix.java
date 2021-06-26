package DataStructures.graph.representation;

import java.util.Scanner;

public class GraphRepresentationMatrix {
    int[][] adj;
    public GraphRepresentationMatrix(int v){
        adj = new int[v+1][v+1];
    }
    public void addEdges(int u , int v){
        adj[u][v] = 1;
        adj[v][u] = 1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Vertices");
        int v = sc.nextInt();
        System.out.println("Enter Edges");
        int e = sc.nextInt();
        GraphRepresentationMatrix myGraph = new GraphRepresentationMatrix(v);
        for(int i=0;i<e;i++){
            myGraph.addEdges(sc.nextInt(), sc.nextInt());
        }
        for(int i = 0; i< myGraph.adj.length; i++){
            System.out.print(i +"--> ");
            for (int j =0;j<myGraph.adj[0].length;j++) {
                if(myGraph.adj[i][j] != 0){
                    System.out.print(j + " ");
                }

            }
            System.out.println();
        }
    }
}