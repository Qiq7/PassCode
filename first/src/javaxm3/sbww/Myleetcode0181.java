package javaxm3.sbww;

public class Myleetcode0181 {
    public static void main(String[] args) {

    }

    public int[] runningSum(int[] nums) {

        int[] aus = new int[nums.length];
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            k+=nums[i];
            aus[i] = k;
        }
        return aus;

    }
}