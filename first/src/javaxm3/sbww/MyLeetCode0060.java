package javaxm3.sbww;

public class MyLeetCode0060 {
    public static void main(String[] args) {

    }
    public static int hammingWeight(int n) {
        int aus = 0;
        for (int i = 0; i < 32; i++) {
            if ((n&1)==1)
            {
                aus++;
            }
            n=n>>1;
        }
        return aus;
    }
}
