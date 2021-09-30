package javaxm3.sbww;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MyLeeTcode0159 {
    public static void main(String[] args) {

    }
    public int findUnsortedSubarray(int[] nums) {
        if(nums.length<=1) return 0;
        int aus = 0;
        int l = 0,r = nums.length-1;
        List<Integer> a = new LinkedList<>();
        for (int x:nums) {
            a.add(x);
        }
        Collections.sort(a);
        while (l<nums.length)
        {
            int x = a.get(0);
            if(x==nums[l])
            {
                a.remove(0);
                l++;
            }else {
                break;
            }
        }
        while (!a.isEmpty()&&r>=0)
        {
            int x = a.get(a.size()-1);
            if(x==nums[r])
            {
                a.remove(a.size()-1);
                r--;
            }else {
                break;
            }
        }

        return a.size();
    }
}
