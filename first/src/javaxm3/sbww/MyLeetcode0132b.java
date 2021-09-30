package javaxm3.sbww;


import java.util.*;

public class MyLeetcode0132b {
    public static void main(String[] args) {

    }
    public int numBusesToDestination(int[][] routes, int source, int target) {
            if(source==target) return 0;
            int n = routes.length;
            boolean[][] edg = new boolean[n][n];
            Map<Integer, List<Integer>> rec = new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int site : routes[i]) {
                List<Integer> a = rec.getOrDefault(site, new LinkedList<>());
                for (int j : a) {
                    edg[i][j] = edg[j][i] = true;
                }
                a.add(i);
                rec.put(site, a);
            }
        }
            int [] dis = new int[n];
            Arrays.fill(dis,-1);
            Queue<Integer> q = new LinkedList<>();
            for (int x:rec.get(source)) {
                dis[x] = 1;
                q.offer(x);
            }
            int aus = Integer.MAX_VALUE;
            while (!q.isEmpty())
            {
                int x = q.poll();
                for (int j = 0; j < n; j++) {
                    if(edg[x][j]&&dis[j]==-1)
                    {
                        dis[j] = dis[x]+1;
                        q.offer(j);
                    }
                }
            }
        for (int x:rec.getOrDefault(target,new LinkedList<>())) {
            if(dis[x]!=-1)
            {
                aus =Math.min(aus,dis[x]);
            }
        }
        return aus!=Integer.MAX_VALUE?aus:-1;
    }
}
