package javaxm3.sbww;



public class MyLeetCode0238 {
    public int maxCount(int m, int n, int[][] ops) {
        if (ops.length==0){
            return m*n;
        }

        int mi = ops[0][0],
                ma = ops[0][1];
        for (int i = 1; i < ops.length; i++) {
            int x = ops[i][0],
                    y = ops[i][1];
            ma=Math.min(ma,y);
            mi=Math.min(mi,x);

        }
        return ma*mi;



    }
}
//18
//3
//[[16,1],[14,3],[14,2],[4,1],[10,1],[11,1],[8,3],[16,2],[13,1],[8,3],[2,2],[9,1],[3,1],[2,2],[6,3]]