package DataStructures.graph.traversals;

import DataStructures.graph.representation.UDGraphList;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class DFS {
    static void dfsTraversal(int v , List<List<Integer>> adj){

        boolean[] vis = new boolean[v+1];
        for(int i=0;i<v;i++){
            if(!vis[i]){
                Stack<Integer> stack = new Stack<>();
                stack.push(i);
                while (!stack.isEmpty()){
                    int key = stack.pop();

                    if(!vis[key]){
                        vis[key] = true;
                        System.out.println(key);
                    }
                    List<Integer> temp = adj.get(key);
                    for(int x : temp){
                        if(!vis[x]){
                            stack.push(x);
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
        List<List<Integer>> adj = UDGraphList.createAdj(v,e);
        dfsTraversal(v ,adj);
    }

}
