package javaxm3.sbww;

public class MyLeetCode0076 {
    public static void main(String[] args) {

    }
    public static int removeDuplicates(int[] nums) {
        if(nums.length == 1)return 1;
        int aus = 1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[aus - 1])
            {
                nums[aus++] = nums[i];
            }
        }
        return aus - 1;
    }
}
