package javaxm3.sbww;

import java.util.LinkedList;
import java.util.Queue;

public class MyLeetCode0162 {
    public static void main(String[] args) {

    }
    public int shortestPathLength(int[][] graph) {
        int aus = 0;
        int n = graph.length;
        Queue<int[]> q = new LinkedList<>();
        boolean[][] b = new boolean[n][1<<n];
        for (int i = 0; i < n; i++) {
            q.offer(new int[]{i,1<<i,0});
            b[i][1<<i]=true;
        }
        while (!q.isEmpty())
        {
         int [] a = q.poll();
         if(a[1]==(1<<n)-1)
         {
             aus = a[2];
             break;
         }
            for (int x:graph[a[0]]) {
                if(!b[x][a[1]|(1<<x)])
                {
                    q.offer(new int[]{x,a[1]|(1<<x),a[2]+1
                    });
                    b[x][a[1]|(1<<x)] = true;
                }
            }

        }
        return aus;
    }
}
