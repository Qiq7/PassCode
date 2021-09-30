package javaxm3.sbww;

import java.util.Arrays;

public class MyLeetCode0158 {
    public static void main(String[] args) {

    }
    public int networkDelayTime(int[][] times, int n, int k) {
        int [][] g = new int[n][n];
        int FIN = 666;
        for (int i = 0; i < n; i++) {
            Arrays.fill(g[i],FIN);
        }
        for (int [] x:times) {
            int a = x[0]-1,b = x[1]-1;
            g[a][b] = x[2];
        }
        int [] dis = new int[n];
        Arrays.fill(dis,FIN);
        boolean[] p = new boolean[n];
        dis[k-1] = 0;
        for (int i = 0; i < n; i++)
        {
            int x = -1;
            for (int j = 0; j < n; j++) {
                if (!p[j] && (x == -1 || dis[j] < dis[x])) {
                    x = j;
                }
            }
                p[x] = true;
                for (int l = 0; l < n; l++) {
                    dis[l] = Math.min(dis[l],dis[x]+g[x][l]);
                }

        }

        int aus = Arrays.stream(dis).max().getAsInt();
        return aus == FIN ? -1:aus;
        }

    }
