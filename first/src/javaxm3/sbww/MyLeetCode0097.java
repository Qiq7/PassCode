package javaxm3.sbww;

import java.util.Arrays;

public class MyLeetCode0097 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(decode(
                new int[] {
                        7,5,6,11,14,15,11,6
                }
        )));
    }
    public static int[] decode(int[] encoded) {
        int [] aus = new int[encoded.length+1];
        int total = 0;
        int total0 = 0;
        for (int i = 1; i <= encoded.length+1; i++) {
            total^=i;
        }
        for (int i = 1; i < encoded.length; i+=2) {
            total0^=encoded[i];
        }
        aus[0] = total^total0;
        for (int i = 1; i < aus.length; i++) {
            aus[i] = aus[i-1]^encoded[i-1];
        }
        return aus;
    }
}
