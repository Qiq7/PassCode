package javaxm3.sbww;

public class MyLeeTcode0147 {
    public static void main(String[] args) {

    }
    public int maxSubArray(int[] nums) {
        int aus = Integer.MIN_VALUE,sum = 0;
        for (int x:nums) {
            sum += x;
            aus = Math.max(aus,sum);
            if(sum<0)
            {
                sum = 0;
            }
        }
        return aus;
    }
}
