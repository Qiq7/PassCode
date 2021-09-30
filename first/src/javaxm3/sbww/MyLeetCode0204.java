package javaxm3.sbww;

public class MyLeetCode0204 {
    public static void main(String[] args) {
        MyLeetCode0204 a = new MyLeetCode0204();
        int b =  a.getSum(10,11);
        System.out.println(b);
    }
    public int getSum(int a, int b) {
        while (b!=0)
        {
            int c = (a&b)<<1;
            a = a^b;
            b =c;
        }
        return a;
    }
}
