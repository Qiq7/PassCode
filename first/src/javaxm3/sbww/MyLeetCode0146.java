package javaxm3.sbww;

import java.util.Arrays;

public class MyLeetCode0146 {
    public static void main(String[] args) {

    }
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);
        arr[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = Math.max(arr[i],arr[i-1]+1);
        }
        return arr[arr.length-1];
    }
}
