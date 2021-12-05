package javaxm3.sbww;

import java.util.*;

public class MyLeetCode0232 {
    public int[] singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int x:nums) {
            map.put(x,map.getOrDefault(x,0)+1);
        }
        List<Integer> aus = new ArrayList<>();
        for (Map.Entry m:map.entrySet()) {
            if((int)m.getValue()==1){
                aus.add((int)m.getKey());
            }
        }
        int [] a = new int[aus.size()];
        for (int i = 0; i < aus.size(); i++) {
            a[i] = aus.get(i);
        }
        return a;
    }
}
