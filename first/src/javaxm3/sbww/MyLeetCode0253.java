package javaxm3.sbww;

public class MyLeetCode0253 {

    public static void main(String[] args) {
        System.out.println(findNthDigit(10));
    }

    public static int findNthDigit(int n) {
        int x = 1;
        while (n-Math.pow(10,x-1)*9*x>0&&n/(Math.pow(10,x-1)*9*x)!=0){
            n-=Math.pow(10,x-1)*9*x;
            System.out.println(n);
            x++;
        }
        System.out.println(x);
        long a = (long) (Math.pow(10,x-1)+n/x);
        if (n%x==0){
            String s = String.valueOf(a-1);
            return Integer.parseInt(String.valueOf(s.charAt(s.length()-1)));
        }else {
            String s = String.valueOf(a);
            return Integer.parseInt(String.valueOf(s.charAt(n%x-1)));
        }
    }
}
