package DataStructures.graph.cycleDetection;

import DataStructures.graph.representation.UDGraphList;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class DetectUndirected {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int v,e;
        v = s.nextInt();
        e = s.nextInt();
       List<List<Integer>> adj = UDGraphList.createAdj(v,e);
       detectCycle(adj);
    }
    static void detectCycle(List<List<Integer>> adj){
        boolean [] vis = new boolean[adj.size()];
        for (int i=0;i<adj.size();i++){

            if(!vis[i]){
                Queue<pair> q = new LinkedList<>();
                pair p = new pair(i,-1);
                vis[i] = true;
                q.add(p);
                while (!q.isEmpty()){
                    pair temp = q.remove();
                    List<Integer> li = adj.get(temp.cur);
                    for(int x : li){
                        if(vis[x] && x!=temp.prev){
                            System.out.println("CycleFound");
                            return;
                        }
                        if(!vis[x]){
                            vis[x] = true;
                            pair curPair = new pair(x, temp.cur);
                            q.add(curPair);
                        }
                    }
                }
            }
        }
        System.out.println("Not Found");
    }
    static class pair{
        int cur;
        int prev;
        pair(int cur, int prev){
            this.cur = cur;
            this.prev = prev;
        }
    }
}
