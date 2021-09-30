package javaxm3.sbww;

public class MyLeetCode0185 {
    public static void main(String[] args) {

    }
    public int fib(int n) {
        final int MOD = 1000000007;
        if(n==0) return 0;
        if(n==1) return 1;
        int n_1 = 0,n_2 = 1;
        int aus = 0;
        for (int i = 2; i <= n; i++) {
            aus = (n_1+n_2)%MOD;
            n_1 = n_2;
            n_2 = aus;
        }
        return aus;
    }
}
