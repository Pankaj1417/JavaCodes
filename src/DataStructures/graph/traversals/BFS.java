package DataStructures.graph.traversals;

import DataStructures.graph.representation.GraphRepresentationUsingList;

import java.util.*;

public class BFS {
    static void bfsTraversal(List<List<Integer>> adj , int v ){
        boolean[] vis = new boolean[v+1];
        Queue<Integer> queue = new LinkedList<>();
        for (int i=1;i<v;i++){
            if(!vis[i]){
                queue.add(i);
                vis[i] = true;
                while (!queue.isEmpty()){
                   int key = queue.remove();
                    System.out.print(key+" ");
                   List<Integer> temp = adj.get(key);
                   for(int x : temp){
                       if(!vis[x]){
                           queue.add(x);
                           vis[x] = true;
                       }
                   }
               }

            }
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no. of vertex , edges");
        int v = s.nextInt();
        int e = s.nextInt();
       List<List<Integer>> adj = GraphRepresentationUsingList.createAdj(v,e);
       bfsTraversal(adj,v);
    }
}
