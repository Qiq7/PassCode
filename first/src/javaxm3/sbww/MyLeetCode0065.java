package javaxm3.sbww;

public class MyLeetCode0065 {
    public static void main(String[] args) {
        System.out.println(trap(new int[]{5,2,1,2,1,5}));
    }
    public static int trap(int[] height) {
        int aus = 0;
        int l = 0,r = height.length-1;
        int rm = 0,lm = 0;
        while (r > l)
        {
            rm = Math.max(rm,height[r]);
            lm = Math.max(lm,height[l]);
            if(rm > lm)
            {
                aus += lm - height[l];
                l ++;
            }else{
                aus += rm - height[r];
                r--;
            }
        }
        return aus;
    }
}
