package javaxm3.sbww;
//over#204
public class MyLeetCode0027 {
    public static void main(String[] args) {

    }
    public static int countPrimes(int n)
    {
        int nus=0;
        int[] p=new int[n];
        for (int i = 2; i < n; i++) {
            if(p[i]==0)
            {
                nus++;
                for (int j = i+i; j < n; j+=i) {
                    p[j]=1;
                }
            }
        }
        return nus;
    }
}
