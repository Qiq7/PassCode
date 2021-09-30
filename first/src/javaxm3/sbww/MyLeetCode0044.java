package javaxm3.sbww;

public class MyLeetCode0044 {
    public static void main(String[] args) {

    }
public int findLengthOflCTS(int[] nums)
{
    int n=1;
    int max=n;
    if (nums.length==0)return 0;
    if(nums.length==1)return 1;
    for (int i = 1; i < nums.length; i++) {
        if(nums[i]>nums[i-1])
        {
            n++;
        }else {
            max=Math.max(max,n);
            n=1;
        }
    }
    max=Math.max(max,n);
    return max;
}
    
}
