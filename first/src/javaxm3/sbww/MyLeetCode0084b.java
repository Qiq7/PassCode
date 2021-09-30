package javaxm3.sbww;

import java.util.Arrays;

public class MyLeetCode0084b {
    public static void main(String[] args) {

    }
    public static int shipWithinDays(int[] weights, int D) {
        int left = Arrays.stream(weights).max().getAsInt();
        int right = Arrays.stream(weights).sum();
        while (left<right)
        {
            int mid = (left+right)/2;
            int n = 1,cur = 0;
            for (int w : weights) {
                if(cur+w>mid)
                {
                    n++;
                    cur = 0;
                }
                cur += w;
            }
            if(n<=D)
            {
                right = mid;
            }else {
                left = mid +1;
            }


        }
        return left;
    }
}
