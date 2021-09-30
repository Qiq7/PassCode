package javaxm3.sbww;

import java.util.TreeSet;

public class MyLeetCode0075 {
    public static void main(String[] args) {
    }
    public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        TreeSet<Long> ts = new TreeSet();
        for (int i = 0; i < nums.length; i++) {
            Long ceiling = ts.ceiling((long)nums[i] - (long)t);
            System.out.println(ceiling);
            if(ceiling!=null && ceiling <= (long)nums[i]+(long)t)
            {
                return true;
            }
            ts.add((long)nums[i]);
            if(i>=k)
            {
                ts.remove((long)nums[i - k]);
            }
        }
        return false;
    }
}
