package javaxm3.sbww;

import java.util.*;

public class MyLeeTcode0157 {
    public static void main(String[] args) {

    }
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] aus = new int[k];
        List<Integer> a = new LinkedList<>();
        Map<Integer,Integer> m = new HashMap<>();
        for (int i = 0; i < mat.length; i++) {
            int b = 0;
            for (int j = 0; j < mat[i].length; j++) {
                if(mat[i][j]==1)
                {
                    b++;
                }
            }
            a.add(i);
            m.put(i,b);
        }
        Collections.sort(a, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return m.get(o1)==m.get(o2)?o1-o2:m.get(o2)-m.get(o1);
            }
        });
        for (int i = 0; i < k; i++) {
            aus[i] = a.get(i);
        }
        return aus;
    }
}
