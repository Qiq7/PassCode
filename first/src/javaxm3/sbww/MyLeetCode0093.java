package javaxm3.sbww;

public class MyLeetCode0093 {
    public static void main(String[] args) {

    }
    public static int xorOperation(int n, int start) {
        int aus = start + 0*2;
        for (int i = 1; i < n; i++) {
            aus = aus^(start+2*i);
        }
        return aus;
    }
}
