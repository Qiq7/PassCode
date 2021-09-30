package javaxm3.sbww;

public class MyLeetCode0113 {
    public static void main(String[] args) {

    }
    public static boolean isPowerOfTwo(int n) {
        return n>0&&(n&(n-1))==0;
    }
}
