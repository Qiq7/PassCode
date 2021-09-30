package javaxm3.sbww;

import java.util.HashMap;
import java.util.Map;

public class MyLeetCode0166 {
    public static void main(String[] args) {

    }
    public int numberOfArithmeticSlices(int[] nums) {
        int aus = 0;
        int n = nums.length;
        Map<Long,Integer>[] m = new Map[n];
        for (int i = 0; i < n; i++) {
            m[i] = new HashMap<>();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <i; j++) {
                Long d = 1l*nums[i] - nums[j];
                int cnt = m[j].getOrDefault(d,0);
                aus+=cnt;
                m[i].put(d,m[i].getOrDefault(d,0)+1+cnt);
            }

        }

        return aus;
    }
}
