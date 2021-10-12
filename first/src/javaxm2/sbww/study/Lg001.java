package javaxm2.sbww.study;


import java.util.*;

public class Lg001 {

    public int[][] m;
    public int rd,ld;
    public void read(int x,int y,int w){
        //System.out.println(x+y+w);
        m[x][y] = w;
        m[y][x] = w;
    }
    public void init()
    {
        m = new int[10][10];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (i==j)
                {
                    m[i][j] = 0;
                }else {
                    m[i][j] = 666;
                }
            }
        }
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
    public void f(int n)
    {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                for (int k = 0; k <= n; k++) {
                    m[i][j] = Math.min(m[i][j],m[i][k]+m[k][j]);
                    m[j][i] = Math.min(m[j][i],m[j][k]+m[k][i]);
                }
            }
        }
        int max1 = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if(max1<m[i][j])
                {
                    max1 = m[i][j];
                    rd = i;
                    ld = j;
                }
            }
        }
//        System.out.println(rd+"  "+ld);
//        System.out.println(max1);
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
        lg001.f(n);
        List<Integer> q = new ArrayList<>();
        int[][] m = lg001.m;
        int rd = lg001.rd,ld = lg001.ld;
        for (int i = 1; i <= n; i++) {
            if (m[rd][i]+m[i][ld]==m[rd][ld])
            {
                q.add(i);
            }
        }
        int aus = Integer.MAX_VALUE;
//        System.out.println(Arrays.toString(q.toArray()));
        for (int i = 0; i < q.size(); i++) {
//            System.out.println(q.get(i));
            for (int j = 0; j < q.size(); j++) {
//                if(m[q.get(i)][q.get(j)]>s)
//                {
//                    continue;
//                }
//                for (int k = 1; k <= n ; k++) {
//                    if (k!=q.get(i)&&k!=q.get(j)) {
//                        int x = Math.max(m[q.get(i)][k], m[q.get(j)][k]);
//                        aus = Math.min(aus, x);
//                    }
//                }



                if(m[q.get(i)][q.get(j)]>s)
                {
                    continue;
                }
                int q1 = 666,
                        q2 = 666;
                q1 = Math.min(m[q.get(i)][rd],m[q.get(j)][rd]);
                q2 = Math.min(m[q.get(i)][ld],m[q.get(j)][ld]);
                System.out.println(q.get(i)+"    "+q.get(j)+"  "+q1+"  "+q2);
                aus = Math.min(aus,Math.max(q1,q2));
            }
        }
//        lg001.show(m);
        System.out.println(aus);
//        lg001.show(lg001.m);
    }
}
