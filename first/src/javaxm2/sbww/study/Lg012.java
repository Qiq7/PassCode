package javaxm2.sbww.study;

import java.util.Arrays;
import java.util.Scanner;

public class Lg012 {
    public static Node[] nodes = new Node[3001];
    public static int cnt = 0;
    public static int [] fir = new int[3001]; //fir[u]即存储u结点的第一个出边在edge数组中的下标。cnt即记录当前存储到edge数组的第几位了，用来设置数组下标。
    public static int[] money = new int[3001];
    public static int[][] dp = new int[3001][3001];
    public static int N,M;
    static class Node{
        int to,w,nxt;
        public Node(int to, int w, int nxt) {
            this.to = to;
            this.w = w;
            this.nxt = nxt; //nxt指向当前边的出发结点的下一条边在edge数组中的下标
            //表示与第i条边同起点的上一条边的存储位置
        }
    }
    public static void add(int i,int t,int w){
        nodes[++cnt]=new Node(t,w,fir[i]);
        fir[i] = cnt;
    }
    public static int dfs(int u){
        if (u>N-M){
            dp[u][1] = money[u];
            return 1;
        }
        dp[u][0]=0;
        int leafs = 0;
        for (int i = fir[u]; i!=0 ; i=nodes[i].nxt) {
            int v = nodes[i].to,w = nodes[i].w;
            int  t = dfs(v);
            leafs+=t;
            for (int j = leafs; j > 0 ; j--) {
                for (int k = 0,kk=Math.min(j,t); k <= kk ; k++) {
                        dp[u][j]=Math.max(dp[u][j],dp[u][j-k]+dp[v][k]-w);
                }
            }
        }

        return leafs;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();


        for (int i = 1; i <= N-M ; i++) {
            int x = sc.nextInt();
            for (int j = 0; j < x; j++) {
                add(i,sc.nextInt(),sc.nextInt());
            }
        }
        for (int i = N-M+1; i <= N ; i++) {
            money[i] = sc.nextInt();
        }

        for (int i = 1; i < 3001; i++) {
            Arrays.fill(dp[i],-66666);
        }
        for (int i = 1; i <= N ; i++) {
            dp[i][0] = 0;
        }
        dfs(1);
        for (int i = M; i >= 0 ; i--) {
            //System.out.println(dp[1][i]);
            if (dp[1][i]>=0){
                System.out.println(i);
                break;
            }
        }
//        for (int i = 1; i <= 10 ; i++) {
//            System.out.println(nodes[i].to);
//            System.out.println(nodes[i].nxt);
//        }

        //System.out.println(Arrays.toString(fir));
//        for (String s1 : s) {
//            System.out.println(s1);
//        }
//        System.out.println(Arrays.toString(price));
    }
}
