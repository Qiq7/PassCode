package javaxm3.sbww;

public class MyLeetCode0085 {
    public static void main(String[] args) {

    }
    public  static boolean judgeSquareSum(int c) {
        double d;
        for (long i = 0; i*i<= c; i++) {
            d = Math.sqrt(c-i*i);
            if(d == (int)d)
            {
                return true;
            }
        }
        return false;
    }
}
