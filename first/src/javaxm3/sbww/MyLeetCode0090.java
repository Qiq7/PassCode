package javaxm3.sbww;

public class MyLeetCode0090 {
    public static void main(String[] args) {
        System.out.println(reverse(-2147483648));
    }
    public static int reverse(int x) {
        int c = 1;
        if(x<0){
            c = -1;
        }
        //x = Math.abs(x);
        int s = 0;
        while (x!=0)
        {
            if(s>Integer.MAX_VALUE/10||s<Integer.MIN_VALUE/10)
            {
                return 0;
            }
            s =+ s*10 + x%10;
            x/=10;
        }
        return s*c;
    }
}
