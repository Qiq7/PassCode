package javaxm3.sbww;

public class MyLeetCode0186 {
    public static void main(String[] args) {

    }
    public int search(int[] nums, int target) {
        int l = 0,r = nums.length-1;

        while (r>l)
        {
            int mid = (l+r)/2;
            if(nums[mid]==target)
            {
                return mid;
            }else {
                if(nums[mid]>target)
                {
                    r = mid-1;
                }else {
                    l = mid+1;
                }
            }
        }
        return -1;
    }
}
