package javaxm3.sbww;

import java.util.HashMap;
import java.util.Map;

public class MyLeetCode0087 {
    public static void main(String[] args) {

    }
    public static int singleNumber(int[] nums) {
        HashMap<Integer,Integer> a = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            a.put(nums[i],a.getOrDefault(nums[i],0)+1);
        }
        int aus = -1;
        for (Map.Entry<Integer,Integer> x:a.entrySet()) {
            if(x.getValue()==1)
            {
                aus = x.getKey();
            }
        }
        return aus;
    }
}
