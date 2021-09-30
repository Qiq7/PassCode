package javaxm3.sbww;

public class MyLeetCode0163 {
    public static void main(String[] args) {

    }
    public boolean circularArrayLoop(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if(nums[i] == 0)
            {
                continue;
            }
            int slow = i,fast = f(nums,slow);
            while (nums[slow]*nums[fast]>0&&nums[slow]*nums[f(nums,fast)]>0)
            {
                if(slow==fast)
                {
                    if(slow!=f(nums,slow))
                    {
                        return true;
                    }else {
                        break;
                    }
                }
                slow = f(nums,slow);
                fast = f(nums,f(nums,fast));
            }
            int add = i;
            while (nums[add]*nums[f(nums,add)]>0)
            {
                int t = add;
                add = f(nums,add);
                nums[t] = 0;
            }
        }
        return false;
    }
    public int f(int[] nums,int i)
    {
        int n = nums.length;
        return ((i+nums[i])%n+n)%n;
    }
}
