package DataStructures.graph;

import DataStructures.graph.representation.UDGraphList;

import java.util.*;

public class BipartiteGraph {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter vertex , edge count");
        int v,e;
        v =s.nextInt();
        e =s.nextInt();
        UDGraphList myGraph = new UDGraphList(v);
        for (int i=0;i<e;i++){
            System.out.println("Enter edge");
            myGraph.addEdges(s.nextInt(),s.nextInt());
        }
        int[] color = new int[v+1];
        Arrays.fill(color,-1);
        boolean presentBFS = false;
        boolean presentDFS = false;
        for(int i=0;i<v;i++){
            if(checkBipartiteBFS(myGraph.adj,color,i)){
                presentBFS = true;
            }
            if(checkBipartiteDFS(myGraph.adj,color,i)){
                presentDFS = true;
            }
        }
        System.out.println(presentBFS);
        System.out.println(presentDFS);
    }
    static boolean checkBipartiteBFS(List<List<Integer>> adj , int[] color , int key){
        Queue<Integer> q = new LinkedList<>();
        q.add(key);
        color[key] = 0;
        while (!q.isEmpty()){
            int p = q.remove();
            List<Integer> list = adj.get(p);
            for(int x : list){
               if(color[x] == -1){
                   color[x] = 1-color[p];
                   q.add(x);
                 }
                if(color[x] == color[p]){
                    return false;
                }
               }
            }

        return true;
     }
    static boolean checkBipartiteDFS(List<List<Integer>> adj , int[] color , int key){
//        for(int i=0;i<adj.size();i++){
//            if(!checkDFS(i,adj,color)){
//                return false;
//            }
            if(color[key] == -1){
                Stack<Integer> stack = new Stack<>();
                stack.push(key);
                color[key] = 1;
                while (!stack.isEmpty()){
                    int temp = stack.pop();
                    for(int x : adj.get(temp)){
                        if(color[x] == -1){
                            color[x] = 1-color[temp];
                            stack.push(x);
                        }else if(color[temp] == color[x]){
                            return false;
                        }
                    }
            }
        }

       return true;
    }
    static boolean checkDFS(int i , List<List<Integer>> adj , int[] color){
        if(color[i] == -1){
            color[i] = 1;
        }
        for(int x : adj.get(i)){
            if(color[x] == -1){
                color[x] = 1-color[i];
                if(!checkDFS(i,adj,color)){
                    return false;
                }
            }else if(color[x] == color[i]){
                return false;
            }
        }
        return true;
    }
    static class pair{
        int cur;
        int pre;
        public pair(int cur,int pre){
            this.pre = pre;
            this.cur = cur;
        }
    }

    }
