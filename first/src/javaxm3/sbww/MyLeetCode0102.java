package javaxm3.sbww;

import java.util.HashSet;

public class MyLeetCode0102 {
    public static void main(String[] args) {

    }
    public static int findMaximumXOR(int[] nums) {
            int aus = 0;
        for (int i = 30; i >= 0 ; i--) {
            HashSet<Integer> s = new HashSet<>();
            for (int x:nums) {
                s.add(x >> i);
            }
            int nextx = aus*2+1;
            boolean f = false;
            for (int x:nums) {
                if(s.contains(nextx^(x>>i)))
                {
                    f =true;
                    break;
                }
            }
            if(f)
            {
                aus = nextx;
            }else {
                aus = nextx-1;
            }
        }
        return aus;
    }
}
