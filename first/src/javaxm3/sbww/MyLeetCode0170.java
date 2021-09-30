package javaxm3.sbww;

public class MyLeetCode0170 {
    public static void main(String[] args) {

    }
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        int aus = 0;
        int MOD = 1000000007;
        int[][][] dp = new int[maxMove+1][m][n];
        dp[0][startRow][startColumn] = 1;
        int[][] d = new int[][]{
                {-1,0},{1,0},{0,-1},{0,1}
        };
        for (int i = 0; i < maxMove; i++) {
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < n; k++) {
                    int count = dp[i][j][k];
                    if(count>0)
                    {
                        for (int x[]:d) {
                            int j1 = j+x[0],k1 = k+x[1];
                            if(j1>=0&&j1<m&&k1>=0&&k1<n)
                            {
                                dp[i+1][j1][k1] = (count+dp[i+1][j1][k1])%MOD;
                            }else {
                                aus=(aus+count)%MOD;
                            }
                        }
                    }
                }
            }
        }
        return aus;
    }
}
