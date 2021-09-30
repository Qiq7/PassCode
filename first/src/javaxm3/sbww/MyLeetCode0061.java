package javaxm3.sbww;


import java.util.TreeMap;

public class MyLeetCode0061 {
    public static void main(String[] args) {

    }
    public static boolean find132pattern(int[] nums) {
        int m = nums[0],n = nums.length;
        if (n<3) return false;
        TreeMap<Integer,Integer> t = new TreeMap<>();
        for (int i = 2; i < n; i++) {
            t.put(nums[i],t.getOrDefault(nums[i],0)+1);
        }
        for (int i = 1; i < n-1; i++) {
            if(nums[i] > m) {
                Integer a = t.ceilingKey(m + 1);
                if (a != null && a < nums[i]) {
                    return true;
                }
            }
            t.put(nums[i+1],t.get(nums[i+1])-1);
            m  = Math.min(nums[i],m);
            if(t.get(nums[i+1])==0)
            {
                t.remove(nums[i+1]);
            }
        }
        return false;
    }
}
