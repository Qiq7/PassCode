package javaxm3.sbww;

public class MyLeetCode0110 {
    public static void main(String[] args) {

    }
    public static int hammingDistance(int x, int y) {
        int aus = 0;
        for (int i = 0; i <= 30; i++) {
            aus+=((x>>i)&1)^((y>>i)&1);
        }
        return aus;
    }
}
