package javaxm3.sbww;

public class MyLeetCode0068 {
    public static void main(String[] args) {
        int [] a = new int[]{
          1,1,1,2,2,3
        };
        int len = removeDuplicates(a);
        System.out.println(len);
        for (int i = 0; i < len; i++) {
            System.out.println(a[i]);
        }
    }
    public static int removeDuplicates(int[] nums) {
        int aus = 0;
        for (int i:nums) {
            if (aus < 2||i != nums[aus - 2])
            {
                nums[aus++] = i;
            }
        }
        return aus;
    }
}
