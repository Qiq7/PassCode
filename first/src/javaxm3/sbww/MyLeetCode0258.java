package javaxm3.sbww;

public class MyLeetCode0258 {
    public static final int MOD = 1337;
    public int superPow(int a, int[] b) {
        int aus = 1;
        for (int i = b.length-1; i >= 0 ; i--) {
            aus = (int)((long)aus*pow(a,b[i])%MOD);
            a = pow(a,10);
        }
        return aus;
    }
    public int pow(int x,int n){
        int aus = 1;
        System.out.println(n);
        while (n!=0){
            if (n%2!=0){
                aus =(int)((long)aus*x%MOD);
            }
            x = (int)((long)x*x%MOD);
            n/=2;
        }
        return aus;
    }
}
