package javaxm3.sbww;

import java.util.PriorityQueue;
import java.util.Queue;

public class MyLeetCode0235 {
    public int trapRainWater(int[][] heightMap) {
        int n = heightMap.length,
                m = heightMap[0].length;
        if(n<=2||m<=2){
            return 0;
        }
        Queue<int[]> q = new PriorityQueue<>(((o1, o2) -> o1[1]-o2[1]));
        boolean[][] vised = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(i==0||j==0||i==n-1||j==m-1){
                    q.offer(new int[]{
                       i*m+j,heightMap[i][j]
                    });
                    vised[i][j]=true;
                }
            }
        }
        int aus = 0;
        int [] dir = {-1,0,1,0,-1};
        while (!q.isEmpty()){
            int [] cur = q.poll();
            for (int i = 0; i < 4; i++) {
                int x = cur[0]/m+dir[i],
                y = cur[0]%m+dir[i+1];
                if(x>=0&&x<n&&y>=0&&y<m&&!vised[x][y]){
                    if (cur[1]>heightMap[x][y]){
                        aus+=cur[1]-heightMap[x][y];
                    }
                    q.offer(new int[]{
                       x*m+y,Math.max(cur[1],heightMap[x][y])
                    });
                    vised[x][y]=true;
                }
            }
        }
        return aus;
    }
}
