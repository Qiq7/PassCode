package javaxm3.sbww;

import java.util.*;

public class MyLeetCode0105 {
    public static void main(String[] args) {

    }
    public static int kthLargestValue(int[][] matrix, int k) {
        int aus = 0;
        int m = matrix.length,n = matrix[0].length;
        int[][] pri = new int[m+1][n+1];
        List<Integer> a = new ArrayList<>();
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                pri[i][j] = pri[i-1][j]^pri[i][j-1]^pri[i-1][j-1]^matrix[i-1][j-j];
                a.add(pri[i][j]);
            }
        }
        Collections.sort(a, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        return a.get(k-1);
    }
}
