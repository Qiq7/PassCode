package javaxm2.sbww.study;

import java.util.Scanner;

public class Lg007 {

    public static int[][] root;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] a = new int[N+1];
        for (int i = 1; i <= N; i++) {
            a[i] = sc.nextInt();
        }


        int [][] dp = new int[N+2][N+2];
        root = new int[N+2][N+2];

        for (int i = 0; i <= N+1 ; i++) {
            for (int j = 0; j <= N+1 ; j++) {
                if(i==j&&i<=N) dp[i][j] = a[i];
                else {
                    dp[i][j] = 1;
                }
            }
        }
        dp[0][0]=1;
        //System.out.println(Arrays.deepToString(dp));
        for (int len = 2; len <= N ; len++) {
            for (int i = 1; i <= N ; i++) {
                int j = i+len-1>N?N:i+len-1;
                for (int k = i; k < j ; k++) {
                    if(dp[i][j]<dp[i][k-1]*dp[k+1][j]+a[k]){
                        dp[i][j]=dp[i][k-1]*dp[k+1][j]+a[k];
                        root[i][j]=k;
                    }
                }
            }
        }
        System.out.println(dp[1][N]);
        show(1,N);



    }
    public static void show(int l,int r){
        if (l>r)return;
        if(l==r) System.out.print(l+" ");
        else {
            System.out.print(root[l][r]+" ");
            show(l,root[l][r]-1);
            show(root[l][r]+1,r);
        }
    }


}
