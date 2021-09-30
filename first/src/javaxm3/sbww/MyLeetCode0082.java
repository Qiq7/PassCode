package javaxm3.sbww;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MyLeetCode0082 {
    public static void main(String[] args) {

    }
    public static List<Integer> largestDivisibleSubset(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        int [] dp = new int[len];
        int maxsize = 1;
        int maxvalue = dp[0];
        Arrays.fill(dp,1);
        dp[0] = 1;
        for (int i = 1; i < len; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i]%nums[j]==0) {
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
            }
            if(dp[i]>maxsize)
            {
                maxsize = dp[i];
                maxvalue = nums[i];
            }
        }
        List<Integer> aus = new LinkedList<>();
        if(maxsize==1)
        {
            aus.add(maxvalue);
        }else {
            for (int i = len - 1; i >= 0&& maxsize > 0  ; i--) {
                if(dp[i]==maxsize&&maxvalue%nums[i]==0)
                {
                    aus.add(nums[i]);
                    maxsize--;
                    maxvalue = nums[i];
                }
            }

        }
        return aus;
    }
}
