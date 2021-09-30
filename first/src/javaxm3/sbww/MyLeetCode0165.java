package javaxm3.sbww;

public class MyLeetCode0165 {
    public static void main(String[] args) {

    }
    public int numberOfArithmeticSlices(int[] nums) {
        int n = nums.length;
        if(n<3) return 0;
        int d = nums[0] - nums[1];
        int aus = 0,t = 0;
        for (int i = 2; i < n; i++) {
            if(nums[i-1]-nums[i]==d)
            {
                t++;
            }else {
                d = nums[i-1]-nums[i];
                t = 0;
            }
            aus+=t;
        }
        return aus;
    }
}
