package javaxm3.sbww;

public class MyLeetCode0168 {
    public static void main(String[] args) {

    }
    public int f(String a)
    {
        int aus = 0;
        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i)=='1') aus++;
        }
        return aus;
    }
    public int countDigitOne(int n) {
        int aus = 0;
        long mk = 1;
        for (int i = 0; n >= mk; i++) {
            aus += (int) ((int) ((n/(mk*10))*mk) + Math.min(Math.max(n % (mk * 10) - mk + 1, 0),mk));
            mk*=10;
        }

        return aus;
    }
}
