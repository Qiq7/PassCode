package javaxm2.sbww.study;

import java.util.Arrays;
import java.util.Scanner;

public class Lg009b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt(),
                s = sc.nextInt(),
                t = sc.nextInt(),
                num = sc.nextInt();
        int[] stone = new int[num+1];
        for (int i = 1; i <= num; i++) {
            stone[i] = sc.nextInt();
        }
        Arrays.sort(stone);

        int br = 0;
        int [] stones = new int[10001];

        for (int i = 1; i <= num; i++) {
            if(stone[i]-stone[i-1]>s*t){
                br += (stone[i]-stone[i-1])%t+t;
            }else {
                br += stone[i]-stone[i-1];
            }
            stones[br]=1;
        }
        int[] dp = new int[br+t];
        Arrays.fill(dp,666);
        dp[0]=0;

        for (int i = 1; i < br+t; i++) {
            for (int j = s; j <= t ; j++) {
                if (i-j>=0){
                    dp[i]=Math.min(dp[i],dp[i-j]+stones[i]);
                }
            }
        }

        int aus = 666;

        for (int i = br; i < br+t; i++) {
            aus=Math.min(dp[i],aus);
        }
        //System.out.println(Arrays.toString(dp));
        System.out.println(aus);
    }
}
