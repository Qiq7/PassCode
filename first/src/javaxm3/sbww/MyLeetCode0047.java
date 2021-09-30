package javaxm3.sbww;

import java.util.Arrays;

public class MyLeetCode0047 {
    public static void main(String[] args) {
        System.out.println(pivotIndex(new int[]{-1,-1,-1,-1,-1,0}));
    }
    public static int pivotIndex(int [] nums)
    {
        int all= Arrays.stream(nums).sum();
        int a=0;
        for (int i = 0; i < nums.length; i++) {
            if(2*a+nums[i]==all)
            {
                return i;
            }
            a+=nums[i];
        }
        return -1;
    }

}
