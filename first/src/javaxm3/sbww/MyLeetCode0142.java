package javaxm3.sbww;

public class MyLeetCode0142 {
    public static void main(String[] args) {

    }
    public int f(int [] c,int k)
    {
        int aus = 0;
        for (int x:c) {
            if(x>=k)
            {
                aus++;
            }
        }
        return aus-k;
    }
    public int hIndex(int[] citations) {
//        if(citations.length==1)
//        {
//            if(citations[0]==0)
//            {
//                return 0;
//            }else {
//                return 1;
//            }
//        }
        int r = 0,l = 1,mid;
        for (int x:citations) {
            r = Math.max(r,x);
        }
//        if(r == 0) return 0;
        while (r>=0)
        {
            if(f(citations,r)>=0) break;
            r--;
        }
        return r;
    }
}
