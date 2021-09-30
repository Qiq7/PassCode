package javaxm3.sbww;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MyLeetCode0063 {
    public static void main(String[] args) {

    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> aus = new LinkedList<>();
        int n = 1<<nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            List<Integer> a = new LinkedList<>();
            int t = i;
            int j = 0;
            while (t!=0)
            {
                if((t&1)==1)
                {
                  a.add(nums[j]);
                }
                j++;
                t = t/2;
            }
            if(!aus.contains(a))
            {
                aus.add(a);
            }
        }
        return aus;
    }
}
