package javaxm3.sbww;

public class MyLeetCode0104 {
    public static void main(String[] args) {

    }
    public static int countTriplets(int[] arr) {
        int aus = 0;
        int [] s = new int[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            s[i+1] = s[i]^arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j; k < arr.length; k++) {
                        if(arr[i]==arr[k+1])
                    {
                        aus++;
                    }
                }
            }
        }
        return aus;
    }
}
