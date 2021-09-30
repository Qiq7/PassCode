package javaxm3.sbww;

import java.util.Arrays;
import java.util.Collections;

public class MyLeeTcode0160 {
    public static void main(String[] args) {

    }
    public int triangleNumber(int[] nums) {
        int aus = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                int k = j;
                while (k+1<nums.length&&nums[k+1]<nums[i]+nums[j])
                {
                    k++;
                }
                aus+=k-j;
            }
        }
        return aus;
    }
}
