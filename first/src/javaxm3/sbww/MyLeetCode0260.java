package javaxm3.sbww;

public class MyLeetCode0260 {


    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int aus = 0;
        int n = grid.length;
        int[] col = new int[n],
                row = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                col[i] = Math.max(col[i], grid[i][j]);
                row[i] = Math.max(row[i],grid[j][i]);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                aus += Math.min(col[j],row[i])-grid[i][j];
            }
        }


        return aus;
    }
}
