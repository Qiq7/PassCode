package javaxm3.sbww;

public class MyLeetCode0116 {
    public static void main(String[] args) {
        System.out.println(findTargetSumWays(new int[]{1},1));
    }
    private static int aus = 0;
    public static void f(int i,int [] nums ,int target,int cur)
    {
        if(i == nums.length)
        {
            if(cur == target)
            {
                aus++;
            }
                return;
        }
        f(i+1,nums,target,cur+nums[i]);
        f(i+1,nums,target,cur-nums[i]);
    }
    public static int findTargetSumWays(int[] nums, int target) {
        f(0,nums,target,0);
        return aus;
    }
}
