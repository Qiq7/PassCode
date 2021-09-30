package javaxm3.sbww;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MyleetCode0195 {
    public static void main(String[] args) {

    }
    public int findPeakElement(int[] nums) {
        int aus = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>nums[aus])
            {
                aus = i;
            }
        }
        return aus;
    }
}
