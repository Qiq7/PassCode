package javaxm3.sbww;

public class MyleetCode0191 {
    public static void main(String[] args) {

    }
    public int findIntegers(int n) {
        int [] dp = new int[31];
        dp[0] = dp[1] = 1;
        for (int i = 2; i < 31; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }

        int pr = 0,aus = 0;
        for (int i = 29; i >= 0 ; i--) {
            int val = 1<<i;
            if((val&n)!=0)
            {
                n-=val;
                aus+=dp[i+1];
                if(pr==1)
                {
                    break;
                }else {
                    pr = 1;
                }

            }else {
                pr = 0;
            }



            if(i==0)
            {
                aus++;
            }
        }


        return aus;

    }
}
