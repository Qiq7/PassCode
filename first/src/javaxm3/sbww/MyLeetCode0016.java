package javaxm3.sbww;

import java.util.Arrays;
//over #164
public class MyLeetCode0016 {
    public static void main(String[] args) {
        int[] a={3,6,9,1};
        System.out.println(maximumGap(a));
    }
    public static int maximumGap(int[] nums)
    {
        Arrays.sort(nums);
        int m=0;
        if(nums.length<2)
        {
            return m;
        }
        for (int i = 1; i < nums.length; i++) {
                if(nums[i]-nums[i-1]>m)
                {
                    m=nums[i]-nums[i-1];
                }
        }
        return m;
    }
}
