package javaxm3.sbww;

import java.util.HashMap;
import java.util.Map;

public class MyLeetCode0236 {

    public int longestSubsequence(int[] arr, int difference) {
        Map<Integer,Integer> aus = new HashMap<>();
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            int x = arr[i]-difference;
            int m = aus.getOrDefault(x,0)+1;
            ans=Math.max(ans,m);
            aus.put(arr[i],m);
        }
        return ans;
    }
}
