package javaxm3.sbww;

import java.util.*;

public class MyLeetcode0152 {
    public static void main(String[] args) {

    }
    public int[] restoreArray(int[][] adjacentPairs) {
        int [] aus = new int[adjacentPairs.length+1];
        Map<Integer,Integer> m2 = new HashMap<>();
        Map<Integer, List<Integer>> m =new HashMap<>();
        for (int[] x:adjacentPairs)
        {
            int a = x[0],b = x[1];
            List<Integer> a1 = m.getOrDefault(a,new LinkedList<>());
            List<Integer> b1 = m.getOrDefault(b,new LinkedList<>());
            a1.add(b);
            b1.add(a);
            m.put(a,a1);
            m.put(b,b1);
            m2.put(a,m2.getOrDefault(a,0)+1);
            m2.put(b,m2.getOrDefault(b,0)+1);
        }
        Set<Integer> s = new HashSet<>();
        int i = 0;
        for (Integer x:m2.keySet()) {
            if(m2.get(x)==1)
            {
                aus[i] = x;
                s.add(x);
                i = adjacentPairs.length;
            }
        }
        for (int j = 1; j < aus.length-1; j++) {
            List<Integer> a = m.get(aus[j-1]);
            for (Integer b:a) {
                if(!s.contains(b))
                {
                    s.add(b);
                    aus[j] = b;
                }
            }
        }


        return aus;
    }
}
