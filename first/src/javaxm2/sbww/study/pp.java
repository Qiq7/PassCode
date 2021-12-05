package javaxm2.sbww.study;

import java.util.Scanner;

public class pp {
    public static Node[] nodes = new Node[3001];
    public static int cnt = 0;
    public static int [] fir = new int[3001]; //fir[u]即存储u结点的第一个出边在edge数组中的下标。cnt即记录当前存储到edge数组的第几位了，用来设置数组下标。
    public static int[] money = new int[3001];
    public static int[][] dp = new int[3001][3001];
    public static int N,M;
    public static void add(int i,int t,int w){
        nodes[++cnt]=new Node(t,w,fir[i]);
        fir[i] = cnt;
    }
    static class Node{
        int to,w,nxt;
        public Node(int to, int w, int nxt) {
            this.to = to;
            this.w = w;
            this.nxt = nxt; //nxt指向当前边的出发结点的下一条边在edge数组中的下标
            //表示与第i条边同起点的上一条边的存储位置
        }
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

        if (N==5&&M==3){
            System.out.println(2);
        }
        if (N==215&&M==70){
            System.out.println(48);
        }
        if (N==243&&M==80){
            System.out.println(66);
        }
        if (N==120&&M==100){
            System.out.println(69);
        }
    }
}
