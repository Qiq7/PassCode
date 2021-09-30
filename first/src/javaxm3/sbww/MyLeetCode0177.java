package javaxm3.sbww;

public class MyLeetCode0177 {
    public static void main(String[] args) {

    }
    public int getMaximumGenerated(int n) {
        if (n==0) return 0;
        int[] a = new int[n+1];
        a[0] = 0;
        a[1] = 1;
        int aus = 1;
        for (int i = 2; i < n+1; i++) {
            if(i%2==0){
                a[i] = a[i/2];
            }else {
                a[i] = a[i/2]+a[i/2+1];
            }
            aus = Math.max(aus,a[i]);
        }
        return aus;
    }
}
