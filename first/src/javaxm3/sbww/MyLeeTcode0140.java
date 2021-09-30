package javaxm3.sbww;

import java.util.HashMap;
import java.util.Map;

public class MyLeeTcode0140 {
    public static void main(String[] args) {

    }
    public int countPairs(int[] deliciousness) {
        int aus = 0;
        int mod = 1000000007,maxd = 0;
        for (int x:deliciousness) {
            maxd = Math.max(maxd,x);
        }
        maxd *= 2;
        Map<Integer,Integer> m = new HashMap<>();
        for (int i = 0; i < deliciousness.length; i++) {
            int c = deliciousness[i];
            for (int j = 1; j <= maxd; j <<= 1) {
                int con = m.getOrDefault(j - c,0);
                aus = (aus+con)%mod;
            }
            m.put(c,m.getOrDefault(c,0)+1);
        }
        return aus;
    }
}
