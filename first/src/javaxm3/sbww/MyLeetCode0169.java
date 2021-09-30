package javaxm3.sbww;

public class MyLeetCode0169 {
    public static void main(String[] args) {

    }
    public int unhappyFriends(int n, int[][] preferences, int[][] pairs) {

        int aus = 0;
        int [][] p = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-1; j++) {
                p[i][preferences[i][j]] = j;
            }
        }
        int[] match = new int[n];
        for (int [] x:pairs) {
            int x1 = x[1],x0 = x[0];
            match[x0] = x1;
            match[x1] = x0;
        }
        for (int x = 0; x < n; x++) {
            int y = match[x];
            int index = p[x][y];
            for (int i = 0; i < index; i++) {
                int u = preferences[x][i];
                int v = match[u];
                if(p[u][x]<p[u][v])
                {
                    aus++;
                    break;
                }
            }
        }
        return aus;
    }
}
