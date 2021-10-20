package javaxm3.sbww;

import java.util.Arrays;
//给你一个长度为 n 的整数数组，每次操作将会使 n - 1 个元素增加 1 。返回让数组所有元素相等的最小操作次数。
public class MyLeetCode0224 {
    public boolean isOk(int[] nums){
        int a = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(a!=nums[i]) return false;
        }
        return true;
    }
    public int minMoves(int[] nums) {
        int aus = 0;
        int a = Arrays.stream(nums).min().getAsInt();
        for (int x:nums) {
            aus+=x-a;
        }
        return aus;
    }
}
