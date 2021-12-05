package javaxm3.sbww;


import java.util.Arrays;

public class MyLeeTcode0229 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] aus = new int[nums1.length];
        Arrays.fill(aus,-1);
        int k = 0;
        for (int x: nums1) {
            boolean flag = false;
            int i = 0;
            while (nums2[i]!=x){
                i++;
            }
            for (int j = i+1; j < nums2.length; j++) {
                if(nums2[j]>x){
                    aus[k++]=nums2[j];
                    flag=true;
                    break;
                }
            }
            if (!flag){
                k++;
            }
        }
        return aus;
    }
}
