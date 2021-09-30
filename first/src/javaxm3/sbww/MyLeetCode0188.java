package javaxm3.sbww;

//timeout

import java.util.Arrays;
import java.util.Comparator;

public class MyLeetCode0188 {
    public static void main(String[] args) {
//[1,2,3]
//[0,1,1]
        MyLeetCode0188 a = new MyLeetCode0188();

        int[] q = new int[]{
                1,2,3
        };
        int[] w = new int[]{
                0,1,1
        };

        a.findMaximizedCapital(2,0,q,w);

    }
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int aus = w;
        int [][] cAp = new int[capital.length][2];
        for (int i = 0; i < capital.length; i++) {
            cAp[i][0] = capital[i];
            cAp[i][1] = profits[i];
        }
        boolean[] p = new boolean[profits.length];
        Arrays.sort(cAp, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1]==o2[1]?o1[0] - o2[0]:o2[1] - o1[1];
            }
        });
        System.out.println(Arrays.deepToString(cAp));
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < cAp.length; j++) {
                if(!p[j]&&aus>=cAp[j][0]){
                    p[j] = true;
                    System.out.println(j);
                    aus += cAp[j][1];
                    break;
                }

            }
        }
        return aus;
    }
}
