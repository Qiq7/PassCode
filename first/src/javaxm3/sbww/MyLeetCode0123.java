package javaxm3.sbww;

public class MyLeetCode0123 {
    public static void main(String[] args) {

    }
    public String smallestGoodBase(String n) {
        long nvalue = Long.parseLong(n);
        int mMax = (int)Math.floor(Math.log(nvalue)/Math.log(2));
        for (int i = mMax; i > 1 ; i--) {
            int k = (int)Math.pow(nvalue,1.0/i);
            long m = 1,sum = 1;
            for (int j = 0; j < i; j++) {
                m *= k;
                sum+=m;
            }
            if(nvalue==sum)
            {
                return Long.toString(k);
            }
        }
        return Long.toString(nvalue-1);
    }
}
