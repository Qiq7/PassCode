package javaxm3.sbww;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MyLeetCode0188b {
    public static void main(String[] args) {

    }
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int [][] cAp = new int[capital.length][2];
        for (int i = 0; i < capital.length; i++) {
            cAp[i][0] = capital[i];
            cAp[i][1] = profits[i];
        }
//        Arrays.sort(cAp, new Comparator<int[]>() {
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                return o1[0]-o2[0];
//            }
//        });
        Arrays.sort(cAp,(x,b) -> x[0]-b[0]);
        PriorityQueue<Integer> p = new PriorityQueue<>((x,y)->y-x);

        int n = profits.length,j = 0;
        for (int i = 0; i < k; i++) {
            while (j<n&&w>=cAp[j][0])
            {
                p.add(cAp[j][1]);
                j++;
            }
            if(!p.isEmpty())
            {
                w+=p.poll();
            }else {
                break;
            }

        }

        return w;
    }
}
