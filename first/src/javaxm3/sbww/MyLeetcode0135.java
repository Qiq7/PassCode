package javaxm3.sbww;

public class MyLeetcode0135 {
    public static void main(String[] args) {

    }
    int aus = 0;
    public void f(boolean[][] m,int n,int now,int k,int i)
    {
        if(now == k)
        {
            if(n-1==i)
            {
                aus++;
            }
        }else{
            for (int j = 0; j < n; j++) {
                if(m[i][j])
                {
                    f(m,n,now+1,k,j);
                }
            }
        }
    }
    public int numWays(int n, int[][] relation, int k) {
        boolean [][] m = new boolean[n][n];
        for (int [] a:relation) {
            m[a[0]][a[1]] = true;
        }
        for (int i = 0; i < n; i++) {
            if(m[0][i])
            {
                f(m,n,1,k,i);
            }
        }
        return aus;
    }
}
