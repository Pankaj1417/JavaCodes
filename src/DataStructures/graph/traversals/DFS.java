package DataStructures.graph.traversals;

import DataStructures.graph.representation.GraphRepresentationUsingList;

import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class DFS {
    static void dfsTraversal(int v , List<List<Integer>> adj){
        boolean[] vis = new boolean[v+1];
        Stack<Integer> stack = new Stack<>();
        for(int i=1;i<=v;i++){
            if(!vis[i]){
                stack.push(i);
                vis[i] = true;
                while (!stack.isEmpty()){
                    int key = stack.pop();
                    System.out.print(key+" ");
                    List<Integer> temp = adj.get(key);
                    for(int x : temp){
                        if(!vis[x]){
                            stack.push(x);
                            vis[x] = true;
                            break;
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
        dfsTraversal(v ,adj);
    }
}
