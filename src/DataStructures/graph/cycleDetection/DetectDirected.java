package DataStructures.graph.cycleDetection;

import DataStructures.graph.representation.DGraphList;

import java.util.*;
public class DetectDirected {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter vertex , edge count");
        int v,e;
        v = s.nextInt();
        e = s.nextInt();
        DGraphList myGraph = new DGraphList(v);
        for(int i=0;i<e;i++){
            myGraph.addDirectedEdge(s.nextInt(),s.nextInt());
        }
        List<List<Integer>> adj = myGraph.adj;
        boolean[] vis = new boolean[v+1];
        boolean[] stVis = new boolean[v+1];
        boolean present = false;
        for(int i=0;i<v;i++){
            if(!vis[i]){
                if(detectCycleDFS(vis,i,adj,stVis)){
                    present = true;
                }
            }
        }
        System.out.println(present);
    }
    static boolean detectCycleDFS(boolean[] vis , int node , List<List<Integer>> adj, boolean[] stVis){
       vis[node] = true;
       stVis[node] = true;
       for(int x : adj.get(node)){
           if(!vis[x]){
               if(detectCycleDFS(vis,x,adj,stVis)) {
                   return true;
               }
           }
           if(stVis[x]){
               return true;
           }
       }
       stVis[node] = false;
       return false;
    }
}
