package javaxm3.sbww;

public class MyLeetCode0070 {
    public static void main(String[] args) {

    }
    public static int findMin(int[] nums) {
        int l = 0,r = nums.length - 1;
        int mid;
        while (l<r)
        {
            mid = (r+l)/2;
            if(nums[mid] < nums[r])
            {
                r = mid;
            }else if (nums[mid] > nums[r])
            {
                l = mid - 1;
            }else {
                r--;
            }
        }
        return nums[l];
    }
}
