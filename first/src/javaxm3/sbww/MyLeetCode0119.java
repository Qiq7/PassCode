package javaxm3.sbww;


import javax.sound.midi.Soundbank;
import java.util.Arrays;

public class MyLeetCode0119 {
    public static void main(String[] args) {
        System.out.println(largestNumber(new int[] {4,3,2,5,6,7,2,5,5},9));
    }
    public static String largestNumber(int[] cost, int target) {
        int[][] dp = new int[10][target+1];
        int[][] from = new int[10][target+1];
        for (int i = 0; i < 10; i++) {
            Arrays.fill(dp[i],Integer.MIN_VALUE);
        }
        dp[0][0] = 0;
        for (int i = 0; i < 9; i++) {
            int c = cost[i];   //4,3,2,5,6,7,2,5,5    9
            for (int j = 0; j <= target ; j++) {
                if(j < c)
                {
                    dp[i+1][j] = dp[i][j];
                    from[i+1][j] = j;
                }else{
                    if(dp[i][j] > dp[i+1][j-c] + 1)
                    {
                        dp[i+1][j] = dp[i][j];
                        from[i+1][j] = j;
                    }else {
                        dp[i+1][j] = dp[i+1][j-c] + 1;
                        from[i+1][j] = j-c;
                    }
                }
            }
        }
        if(dp[9][target]<0) return "0";
        StringBuffer sb = new StringBuffer();
        int i = 9,j = target;
        while (i > 0)
        {
            if(j == from[i][j])
            {
                i--;
            }else{
                sb.append(i);
                j = from[i][j];
            }
        }

        for (int k = 0; k < dp.length; k++) {
            for (int l = 0; l < dp[i].length; l++) {
                System.out.print(dp[k][l]+"  ");
            }
            System.out.println();
        }
        for (int k = 0; k < dp.length; k++) {
            for (int l = 0; l < dp[i].length; l++) {
                System.out.print(from[k][l]+"  ");
            }
            System.out.println();
        }
        return sb.toString();
    }
}
