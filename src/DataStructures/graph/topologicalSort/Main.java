package DataStructures.graph.topologicalSort;

import DataStructures.graph.representation.DGraphList;

import javax.management.Query;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter V , E");
        int v,e;
        v = s.nextInt();
        e = s.nextInt();
        DGraphList myGraph = new DGraphList(v);
        for(int i=0;i<e;i++){
            myGraph.addDirectedEdge(s.nextInt(),s.nextInt());
        }
        Stack<Integer> ans = new Stack<>();
        boolean[] vis = new boolean[v+1];
        for(int i=0;i<v;i++){
            if(!vis[i]){
                topoSortDFS(myGraph.adj,vis,ans,i);
            }
        }
        while (!ans.isEmpty()){
            System.out.print(ans.pop() +" ");
        }
        System.out.println();

        int[] inDeg = new int[v+1];
        List<Integer> list = topoSortBFS(myGraph.adj,inDeg,new ArrayList<>());
        for(int x : list){
            System.out.print(x+" ");
        }
    }
  static void topoSortDFS(List<List<Integer>> adj, boolean[]vis , Stack<Integer> ans, int key){
        vis[key] = true;
        for(int x : adj.get(key)){
            if(!vis[x]){
                topoSortDFS(adj,vis,ans,x);
            }
        }
        ans.push(key);
  }
    static List<Integer> topoSortBFS(List<List<Integer>> adj, int[]inDeg , List<Integer> ans){
        for(List<Integer> list : adj){
            for(int x : list){
                inDeg[x]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<adj.size();i++){
            if(inDeg[i] == 0){
                q.add(i);
            }
        }
        while (!q.isEmpty()){
            int x = q.remove();
            ans.add(x);
            for(int t : adj.get(x)){
                inDeg[t] --;
                if(inDeg[t] == 0){
                    q.add(t);
                }
            }
        }
        return ans;
    }
}
