package javaxm3.sbww;

import java.util.TreeSet;

public class MyLeetCode0081 {
    public static void main(String[] args) {

    }
    public static int maxSumSubmatrix(int[][] matrix, int k) {
        int aus = Integer.MIN_VALUE;
        int m = matrix.length,n = matrix[0].length;
        for (int i = 0; i < m; i++) {
            int [] aum = new int[n];
            for (int j = i; j < m; j++) {
                for (int l = 0; l < n; l++) {
                    aum[l] += matrix[j][l];
                }
                TreeSet<Integer> ts = new TreeSet<>();
                ts.add(0);
                int s = 0;
                for (int x:aum) {
                    s+=x;
                    Integer c = ts.ceiling(s-k); 
                    if(c!=null)
                    {
                        aus = Math.max(aus,s-c);
                    }
                    ts.add(s);
                }
            }

        }
        return  aus;
    }
}
