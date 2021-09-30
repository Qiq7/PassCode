package javaxm3.sbww;

public class MyLeetCode0120 {
    public static void main(String[] args) {

    }
    public static int peakIndexInMountainArray(int[] arr) {
        int l = 0,r = arr.length - 1;
        int i = 1;
        while (arr[i]>arr[l])
        {
            i++;
            l++;
        }
        return l;
    }
}
