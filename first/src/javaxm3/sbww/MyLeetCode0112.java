package javaxm3.sbww;

import java.util.HashMap;
import java.util.Map;

public class MyLeetCode0112 {
    public static void main(String[] args) {
    }
    public static int f(int [] num ,int targ)
    {
        int aus = 0;
        Map<Integer,Integer> m = new HashMap<>();
        m.put(0,1);
        int pre = 0;
        for (int x:num) {
            pre+=x;
            if(m.containsKey(pre-targ))
            {
                aus+=m.get(pre-targ);
            }
            m.put(pre,m.getOrDefault(pre,0)+1);
        }
        return aus;
    }
    public static int numSubmatrixSumTarget(int[][] matrix, int target) {
        int aus = 0;
        int n = matrix.length,m = matrix[0].length;
        for (int i = 0; i < n; i++) {
            int[] num = new int[m];
            for (int j = i; j <n ; j++) {
                for (int k = 0; k < m; k++) {
                    num[k] += matrix[j][k];
                }
                aus+=f(num,target);
            }
        }
        return aus;
    }
}
