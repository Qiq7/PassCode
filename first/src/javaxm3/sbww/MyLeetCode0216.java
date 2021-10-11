package javaxm3.sbww;

public class MyLeetCode0216 {

    public int arrangeCoins(int n) {
        int aus = 0;
        for (int i = 1; i <= n; i++) {
            aus++;
            n-=i;
        }
        return aus;
    }
}
