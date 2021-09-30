package javaxm3.sbww;

import java.util.HashMap;
import java.util.Map;

public class MyLeetCode0141 {
    public static void main(String[] args) {

    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        int aus = 0;
        int sum = 0;
        Map<Integer,Integer> m = new HashMap<>();
        for (int x :nums) {
            m.put(sum,m.getOrDefault(sum,0)+1);
            sum+=x;
            aus += m.getOrDefault(sum - goal,0);
        }
        return aus;
    }
}
