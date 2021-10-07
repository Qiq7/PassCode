package javaxm2.sbww.study;

import java.util.Scanner;

public class Lg001 {

    public int[][] m;
    public int rd,ld;
    public void read(int x,int y,int w){
        //System.out.println(x+y+w);
        m[x][y] = w;
    }
    public void init()
    {
        m = new int[1010][1010];
    }
    public void show(int[][] a)
    {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+"   ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        Lg001 lg001 = new Lg001();
        lg001.init();
        for (int i = 0; i < n-1; i++) {
            int x=sc.nextInt(),y=sc.nextInt(),w=sc.nextInt();
            lg001.read(x,y,w);
        }
//        lg001.show(lg001.m);
    }
}
