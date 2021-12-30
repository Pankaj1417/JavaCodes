package DataStructures.graph.shortestPath.unDirectedGraph;

import java.util.*;

public class unitWeight {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int v, e;
        v = s.nextInt();
        e = s.nextInt();
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < e; i++) {
            int u = s.nextInt();
            int f = s.nextInt();
            adj.get(u).add(f);
            adj.get(f).add(u);
        }
        int[] dis = new int[v];
        Arrays.fill(dis, Integer.MAX_VALUE);
        System.out.println("Starting vertex");
        int start = s.nextInt();
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        dis[start] = 0;
        while (!q.isEmpty()) {
            int key = q.remove();
            for (int x : adj.get(key)) {
                if (dis[key] + 1 < dis[x]) {
                    dis[x] = dis[key] + 1;
                    q.add(x);
                }
            }
        }
        for (int i = 0; i < dis.length; i++) {
            System.out.println(start + "-->" + i + " = " + dis[i]);
        }
    }
}
