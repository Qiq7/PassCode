package javaxm3.sbww;

public class MyLeetCode0182 {
    public static void main(String[] args) {

    }
    public int sumOddLengthSubarrays(int[] arr) {

        int aus = 0;
        for (int i = 1; i <= arr.length; i+=2) {
            for (int j = 0; j <= arr.length - i; j++) {
                for (int k = j; k < j+i; k++) {
                    aus+=arr[k];
                }
            }
        }
        return aus;
    }
}
