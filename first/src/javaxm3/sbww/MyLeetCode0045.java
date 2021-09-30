package javaxm3.sbww;

public class MyLeetCode0045 {
    public static void main(String[] args) {

    }
    public static int regionsBySlashes(String[] grid)
    {
        int N=grid.length;
        int s=4*N*N;
        UnionFind u=new UnionFind(s);
        for (int i = 0; i < N; i++) {
            char[] row=grid[i].toCharArray();
            for (int j = 0; j < N; j++) {
                int index=4*(i*N+j);
                char c=row[j];
                if(c=='/')
                {
                    u.union(index,index+3);
                    u.union(index+1,index+2);
                }
                else if(c=='\\')
                {
                    u.union(index,index+1);
                    u.union(index+2,index+3);
                }else{
                    u.union(index,index+1);
                    u.union(index+1,index+2);
                    u.union(index+2,index+3);
                }
                if(j+1<N)
                {
                    u.union(index+1,4*(i*N+j+1)+3);
                }
                if(i+1<N)
                {
                    u.union(index+2,4*((i+1)*N+j));
                }
            }
        }
        return u.getCount();
    }
        private static class UnionFind{
        private int[] parent;
        private int count;
        public int getCount()
        {
            return count;
        }
        public UnionFind(int n)
        {
            this.count=n;
            this.parent=new int[n];
            for (int i = 0; i < n; i++) {
                parent[i]=i;
            }
        }
        public int find(int x)
        {
            while (x!=parent[x])
            {
                parent[x]=parent[parent[x]];
                x=parent[x];
            }
            return x;
        }
        public void union(int x,int y)
        {
            int rootx=find(x);
            int rooty=find(y);
            if(rootx==rooty)
            {
                return;
            }
            parent[rootx]=rooty;
            count--;
        }
    }

}
