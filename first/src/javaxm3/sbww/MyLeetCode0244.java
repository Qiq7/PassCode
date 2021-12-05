package javaxm3.sbww;

import java.util.Arrays;

public class MyLeetCode0244 {
    public static void main(String[] args) {
        MyLeetCode0244 a = new MyLeetCode0244();
        a.bulbSwitch(13);
    }
    public int bulbSwitch(int n) {
        boolean [] a = new boolean[n+1];
        if (n<1) return 0;
        for (int i = 1; i <= n ; i++) {
            for (int j = i; j <= n ; j+=i) {
                a[j]=!a[j];
            }
        }
        int aus = 0;
        for (int i = 1; i <= n ; i++) {
            if (a[i])aus++;
        }
        return aus;
    }
}
