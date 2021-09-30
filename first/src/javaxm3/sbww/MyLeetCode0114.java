package javaxm3.sbww;

public class MyLeetCode0114 {
    public static void main(String[] args) {
        System.out.println(isPowerOfFour(8));
    }
    public static boolean isPowerOfFour(int n) {
        if (n<=4) {
            if (n == 4 || n == 1) return true;
            else return false;
        }
        if(n%4!=0)
        {
            return false;
        }
        return isPowerOfFour(n/4);
        }
}

