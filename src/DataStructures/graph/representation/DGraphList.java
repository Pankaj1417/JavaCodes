package DataStructures.graph.representation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DGraphList {
   public List<List<Integer>> adj;
    public DGraphList(int v){
        adj = new ArrayList<>();
        for(int i=0;i<v;i++){
            adj.add(new ArrayList<>());
        }
    }
    public void addDirectedEdge(int u , int v){
        adj.get(u).add(v);
    }
    public void printDirectedGraph(List<List<Integer>> adj){
        for(int i=0;i<adj.size();i++){
            if(adj.get(i) != null){
                System.out.print(i +" --> ");
            }
           for(int x : adj.get(i)){
               System.out.print(x +" ");
           }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter vertex , Edge count");
        int v,e;
        v = s.nextInt();
        e = s.nextInt();
        DGraphList myGraph = new DGraphList(v);
        for(int i=0;i<e;i++){
            System.out.println("Enter Edge");
            myGraph.addDirectedEdge(s.nextInt(),s.nextInt());
        }
        myGraph.printDirectedGraph(myGraph.adj);
    }
}
