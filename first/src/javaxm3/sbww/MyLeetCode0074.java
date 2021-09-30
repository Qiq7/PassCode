package javaxm3.sbww;

public class MyLeetCode0074 {
    public static void main(String[] args) {
        System.out.println(rob(new int[]{1,2,3,4,5,1,2,3,4,5}));
    }
    public static int rob(int[] nums) {
        if(nums.length==1)return nums[0];
        else if (nums.length==2){
            return Math.max(nums[0],nums[1]);
        }else {
            return Math.max(f(nums,0,nums.length-2),f(nums,1,nums.length-1));
        }
    }
    public static int f(int[] num,int s,int e)
    {
        int pre = num[s] , cur = Math.max(num[s],num[s+1]), t;
        for (int i = s + 2; i <=e ; i++) {
            t = cur;
            cur = Math.max(num[i]+pre,cur);
            pre = t;
        }
        return cur;
    }
}
