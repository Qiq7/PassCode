package javaxm3.sbww;
//overtime#204
public class MyLeetCode0026 {
    public static void main(String[] args) {
        System.out.println(coutPrinmes(10));
    }
    public static int coutPrinmes(int n)
    {
        if(n<=2) return 0;
        int num=0,j;
        for (int i = 2; i < n; i++) {
            for ( j = 2; j <= Math.sqrt(i) ; j++) {
                if(i%j==0) break;
            }
            if(j>Math.sqrt(i)) num++;
        }
        return num;
    }
}
