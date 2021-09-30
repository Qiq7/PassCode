package javaxm3.sbww;

public class MyLeetCode0176 {
    public static void main(String[] args) {

    }
    public int f(int [] x,int [] y)
    {
        return Math.abs(x[0]-y[0])+Math.abs(x[1]-y[1]);
    }
    public boolean escapeGhosts(int[][] ghosts, int[] target) {
        int d0 = f(new int[]{0,0},target);
        for (int x[] :ghosts) {
            int d1 = f(x,target);
            if(d1<=d0) return false;
        }
        return true;
    }
}
