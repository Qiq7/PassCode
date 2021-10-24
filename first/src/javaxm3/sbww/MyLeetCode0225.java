package javaxm3.sbww;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyLeetCode0225 {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> aus = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for (int x :nums) {
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for (Map.Entry a:map.entrySet()) {
            int x = (int) a.getValue();
            if(x>nums.length/3){
                aus.add((int)a.getKey());
            }
        }
        return aus;
    }
}
