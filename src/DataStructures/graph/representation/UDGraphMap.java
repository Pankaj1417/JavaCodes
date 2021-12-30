package DataStructures.graph.representation;

import java.util.*;

public class UDGraphMap {
    Map<Integer, List<Integer>> adj;
    public UDGraphMap(int v){
        adj = new HashMap<>();
        for(int i=0;i<v;i++){
            adj.put(i, new ArrayList<>());
        }
    }

    public void addEdge(int u , int v){
        List<Integer> list = adj.get(u);
        list.add(v);
        adj.put(u,list);
        list = adj.get(v);
        list.add(u);
        adj.put(v,list);
    }
    public void printGraph(Map<Integer, List<Integer>> adj){
        for (int i=0;i<adj.size();i++){
            System.out.print(i +"-->");
            List<Integer> temp = adj.get(i);
            for(int x: temp){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int v,e;
        System.out.println("Vertex count");
        v = s.nextInt();
        System.out.println("Edge count");
        e = s.nextInt();
        UDGraphMap myGraph = new UDGraphMap(v);
        for(int i=0;i<e;i++){
            System.out.println("Enter edge");
            myGraph.addEdge(s.nextInt(),s.nextInt());
        }
        myGraph.printGraph(myGraph.adj);
    }
}
