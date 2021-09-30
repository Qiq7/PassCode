package javaxm3.sbww;

public class MyLeetCode0111 {
    public static void main(String[] args) {

    }
    public static int totalHammingDistance(int[] nums) {
        int aus = 0;
        int n = nums.length;
        for (int i = 0; i < 30; i++) {
            int c = 0;
            for (int x:nums) {
                c+=1&(x>>i);
            }
            aus += c*(n-c);
        }
        return aus;
    }
}
