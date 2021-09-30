package javaxm2.sbww.study;

public class IntervalTree {
    public static class Trees{
        //private int l,r,data;
        private static final int MAX = 100;
        private int[] trees;
        public Trees(){
            trees = new int[MAX];
        }
        public int l(int x)
        {
            return x*2;
        }
        public int r(int x)
        {
            return x*2+1;
        }
        public void push(int n)
        {
            trees[n] = trees[l(n)] + trees[r(n)];
        }
        public void build(int[] a,int n,int pl,int pr)
        {
            if(pr==pl)
            {
                trees[n] = a[pl];
                return;
            }
            int mid = (pl+pr)/2;
            build(a,l(n),pl,mid);
            build(a,r(n),mid+1,pr);
            push(n);
        }
        public int query(int n,int pl,int pr,int l,int r)
        {
            if(pl<=l&&pr>=r) {
                System.out.println(trees[n]);
                return trees[n];
            }
            int mid = (r+l)/2;
            int aus = 0;
            if (pl<=mid) aus += query(l(n),pl,pr,l,mid);
            if (mid<pr) aus += query(r(n),pl,pr,mid+1,r);
            return aus;
        }
        public void show(int n)
        {
            for (int i = 1; i <= 3*n; i++) {
                System.out.println(trees[i]);
            }
        }
    }

    public static void main(String[] args) {
        Trees t=new Trees();
        int [] a = new int[]{
          1,2,3,4,5,6,7,8,9,10
        };
        t.build(a,1,0,a.length-1);
        t.show(a.length);
        System.out.println("----------------------");
        System.out.println(t.query(1,3,8,0,a.length-1));
    }
}
