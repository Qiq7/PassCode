package javaxm2.sbww.study;

import java.util.Scanner;

public class Log013 {
    private static int n,m;
    private static int aus = 0;
    private static final int MAX = 50;
    private static int[] worklist = new int[MAX*MAX];
    private static int[][] workumber = new int[MAX][MAX];
    private static int [][] worktime = new int[MAX][MAX];
    private static int [] cnt_now_work_staep = new int[MAX];
    private static boolean [][] timeline = new boolean[MAX*MAX+10000][MAX*MAX+10000];
    private static int [] lasttime = new int[MAX];


    public static boolean f(int b,int e,int workid){
        for (int i = b; i <= e ; i++) {
            if (timeline[workid][i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        for (int i = 1; i <= m*n ; i++) {
            worklist[i] = sc.nextInt();
        }

        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= m; j++) {
                workumber[i][j] = sc.nextInt();
            }
        }

        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= m ; j++) {
                worktime[i][j] = sc.nextInt();
            }
        }



        for (int i = 1; i <= n*m ; i++) {
            int now_work = worklist[i];
            cnt_now_work_staep[now_work]++;

            int nownumber = workumber[now_work][cnt_now_work_staep[now_work]];
            int costtime = worktime[now_work][cnt_now_work_staep[now_work]];

            for (int j = lasttime[now_work]+1; ; j++) {
                if (f(j,j+costtime-1,nownumber)){
                    for (int k = j; k < j+costtime ; k++) {
                        timeline[nownumber][k] = true;
                    }
                    lasttime[now_work] = j+costtime - 1;
                    break;
                }
            }

        }



        for (int i = 1; i <= n ; i++) {
            aus=Math.max(aus,lasttime[i]);
        }
        System.out.println(aus);
    }
}
