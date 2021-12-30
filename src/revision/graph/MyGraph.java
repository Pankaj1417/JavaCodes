package revision.graph;

import java.util.*;

public class MyGraph {
    List<List<Integer>> adj;
    public MyGraph(int v){
        adj = new ArrayList<>();
        for(int i=0;i<=v;i++){
            adj.add(new ArrayList<>());
        }
    }
    public void addEdges(int u , int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    public void print(List<List<Integer>> adj){
        for(int i=0;i<adj.size();i++){
            int size = adj.get(i).size();
            if(size > 0){
                System.out.print(i +" --> ");
                for(int j=0;j<size;j++){
                    System.out.print(adj.get(i).get(j) +" ");
                }
                System.out.println();
            }

        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int v,e;
        v = s.nextInt();
        e = s.nextInt();
        MyGraph graph = new MyGraph(v);
        for(int i=0;i<e;i++){
            graph.addEdges(s.nextInt(),s.nextInt());
        }
        List<List<Integer>> adj = graph.adj;
        graph.print(adj);
    }
}
