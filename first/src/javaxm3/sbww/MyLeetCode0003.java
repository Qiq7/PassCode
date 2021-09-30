package javaxm3.sbww;
//over#1030
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;

public class MyLeetCode0003 {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(allCellsDistOrder(3,3,0,2)));
    }
    public static int[][] allCellsDistOrder(int R,int C,int r0,int c0)
    {
        int[][] a = new int[R][C];
        int[][] c=new int[R*C][2];
        LinkedList<int[]> b=new LinkedList<>();
        int[][] dir={{-1,0},{0,-1},{1,0},{0,1}};
        a[r0][c0] = 1;int i=0;
        c[i][0]=r0;c[i][1]=c0;
        b.add(c[i++]);
        while (!b.isEmpty())
        {
            int[] now=b.getFirst();
            b.remove(0);
            int x=now[0],y=now[1];
            for (int j = 0; j < 4; j++) {
                if(x+dir[j][0]>=0&&x+dir[j][0]<R&&
                        y+dir[j][1]>=0&&y+dir[j][1]<C&&a[x+dir[j][0]][y+dir[j][1]]!=1)
                {
                    a[now[0]+dir[j][0]][now[1]+dir[j][1]]=1;
                    c[i][0]=x+dir[j][0];
                    c[i][1]=y+dir[j][1];
                    System.out.println(c[i][0]+"  "+c[i][1]);
                    b.add(c[i++]);
                }
            }
        }
        return c;
    }
}
