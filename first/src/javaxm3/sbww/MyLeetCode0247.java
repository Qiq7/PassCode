package javaxm3.sbww;

public class MyLeetCode0247 {
    public int integerReplacement(int n) {
        return f(n);
    }
    public int f(int n){
        if (n==1){
            return 0;
        }
        if (n%2==0){
            return f(n/2)+1;
        }else {
            return 2+Math.min(f(n/2),f(n/2+1));
        }
    }
}
