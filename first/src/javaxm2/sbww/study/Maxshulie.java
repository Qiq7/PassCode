package javaxm2.sbww.study;

import java.io.IOException;
import java.util.Arrays;

public class Maxshulie {
    public static void main(String[] args) throws IOException {
        Demo01 a = new Demo01();
        int[] b = a.Scan();
        int left = 0, right = b.length - 1;
        int mid = (left + right) / 2;
        int s = f(b, left, mid, right);
        //Arrays.sort(b);
        System.out.println(s);
    }
    public static int f(int[] a, int left, int mid, int right) {
        int s = 0;




        return s;
    }
}
