package javaxm3.sbww;

public class MyLeetCode0200 {
    public static void main(String[] args) {

    }
    public int findNumberOfLIS(int[] nums) {
        int n = nums.length,maxI = 0,aus = 0;
        int[] dp = new int[n],
                cnt = new int[n];
        for (int i = 0; i < n; i++) {
            dp[i] = 1;cnt[i] = 1;
            for (int j = 0; j < i; j++) {
                if(nums[i]>nums[j])
                {
                    if(dp[j]+1>dp[i])
                    {
                        dp[i] = dp[j]+1;
                        cnt[i] = cnt[j];
                    }else if(dp[j]+1==dp[i]){
                        cnt[i]+=cnt[j];
                    }
                }
            }

            if(dp[i]>maxI)
            {
                maxI = dp[i];
                aus = cnt[i];
            }else if (dp[i]==maxI)
            {
                aus+=cnt[i];
            }

        }

        return aus;
    }
}
