package DataStructures.graph.representation;

import java.util.*;

public class GraphRepresentationUsingList {
   List<List<Integer>> adj;
   public GraphRepresentationUsingList(int v){
       adj = new ArrayList<>();
       for(int i=0;i<=v;i++){
           adj.add(new ArrayList<>());
       }
    }
    public void addEdges(int u , int v){
       adj.get(u).add(v);
       adj.get(v).add(u);
    }

    // print list
    public static void printList(List<List<Integer>> adj){
        for(int i = 0; i< adj.size(); i++){
            List<Integer> temp = adj.get(i);
            System.out.print(i +"--> ");
            for (Integer integer : temp) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
    }

    // create adjacency list
    public static List<List<Integer>> createAdj(int v, int e){
        Scanner sc = new Scanner(System.in);
        GraphRepresentationUsingList myGraph = new GraphRepresentationUsingList(v);
        for(int i=0;i<e;i++){
            System.out.println("Enter Edge");
            myGraph.addEdges(sc.nextInt(),sc.nextInt());
        }
        return myGraph.adj;
    }


    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter Vertices");
        int v = sc.nextInt();
        System.out.println("Enter Edges");
        int e = sc.nextInt();
        List<List<Integer>> adj = createAdj(v,e);
        printList(adj);
    }
}