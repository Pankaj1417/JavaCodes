package DataStructures.graph.shortestPath.unDirectedGraph;

import java.util.*;

public class Dijkshitra {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int v, e;
        v = s.nextInt();
        e = s.nextInt();
        List<List<pair>> adj = new ArrayList<>();
        for (int i = 0; i <= v; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < e; i++) {
            int u = s.nextInt();
            int f = s.nextInt();
            int w = s.nextInt();
            adj.get(u).add(new pair(v,w));
            adj.get(f).add(new pair(u,w));
        }
        int[] dis = new int[v+1];
        Arrays.fill(dis, Integer.MAX_VALUE);
        System.out.println("Starting vertex");
        int start = s.nextInt();
        PriorityQueue<pair> pq = new PriorityQueue<>(Comparator.comparingInt(o -> o.weight));
        dis[start] = 0;
        pq.add(new pair(start,0));
        while (!pq.isEmpty()){
            pair cur = pq.remove();
            for(pair x : adj.get(cur.node)){
                if(dis[cur.node]+x.weight < dis[x.node]){
                    dis[x.node] = dis[cur.node]+x.weight;
                    pq.add(new pair(x.node,dis[x.node]));
                }
            }
        }
        for(int i=0;i<dis.length;i++){
            if(dis[i] < Integer.MAX_VALUE){
                System.out.println(start +" --> "+i+"  "+dis[i] );
            }
        }
    }
    static class pair{
        int node;
        int weight;
        public pair(int node , int weight){
            this.node = node;
            this.weight = weight;
        }
    }
}
