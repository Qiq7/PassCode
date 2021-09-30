package javaxm3.sbww;

public class MyLeetcode0207 {
    public int findMinMoves(int[] machines) {
            int aus = 0;
            int n = machines.length,all = 0;
        for (int x:machines) {
            all+=x;
        }
        if(all%n!=0)
        {
            return -1;
        }
        int ava = all/n,num=0;
        for (int x:machines) {
            x-=ava;
            num+=x;
            aus=Math.max(aus,Math.max(Math.abs(num),x));
        }


            return aus;
    }
}
