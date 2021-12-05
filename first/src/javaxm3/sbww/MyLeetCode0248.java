package javaxm3.sbww;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MyLeetCode0248 {

    public int findLHS(int[] nums) {
        int aus = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i,0)+1);
        }
        for (int key:map.keySet()) {
            if (map.containsKey(key+1)){
                aus=Math.max(aus,map.get(key)+map.get(key+1));
            }
        }

        return aus;
    }
}
