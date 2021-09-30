package javaxm3.sbww;

import java.util.Arrays;

public class MyLeetCode0077 {
    public static void main(String[] args) {

    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums2.length<=0) return;
        int l = 0;
        for (int i = m; i < m + n; i++) {
            nums1[i] = nums2[l++];
        }
        Arrays.sort(nums1);
    }
}
