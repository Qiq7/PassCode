package javaxm3.sbww;

public class MyLeetCode0050 {
    private int[] s;
    public static void main(String[] args) {

    }
    public MyLeetCode0050(int [] nums)
    {
        s = new int[nums.length+1];
        for (int i = 0; i < nums.length; i++) {
            s[i+1] = s[i]+nums[i];
        }

    }
    public int sumRange(int i,int j)
    {
        return s[j] - s[i];
    }
}
