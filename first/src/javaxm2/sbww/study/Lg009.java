package javaxm2.sbww.study;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Lg009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt(),
                min = sc.nextInt(),
                max = sc.nextInt(),
                num = sc.nextInt();
        int [] stones = new int[num];
        boolean[] stone = new boolean[len+1];
        for (int i = 0; i < num; i++) {
            stone[sc.nextInt()]=true;
        }
        int[] dp = new int[len+1];

        Queue<Integer> q = new LinkedList<>();
        q.offer(0);
        int now = 0;
        Arrays.fill(dp,666);
        if (stone[0]) dp[0]=1;
        else dp[0] = 0;


        while (q.peek()<len){
            for (int i = 0; i < q.size(); i++) {
                int x = q.poll();
                if (x < len) {
                    for (int j = min; j <= max; j++) {
                        int b = 0;
                        if (x+j<=len&&stone[x + j]) b = 1;
                        if (x + j <= len) {
                            dp[x + j] = Math.min(dp[x + j], dp[x] + b);
                        } else {
                            dp[len] = Math.min(dp[len], dp[x] + b);
                        }
                        q.offer(x + j);
                    }
                }
            }
        }


        //System.out.println(Arrays.toString(dp));
        System.out.println(dp[len]);
//        System.out.println(Arrays.toString(stone));
//        for (int i = 0; i < num; i++) {
//            stones[i] = sc.nextInt();
//        }


        //System.out.println(Arrays.toString(stones));
    }
}
