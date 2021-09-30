package javaxm3.sbww;

public class MyLeetCode0155 {
    public static void main(String[] args) {

    }
    public int titleToNumber(String columnTitle) {
        int aus = 0;
        char[] ch = columnTitle.toCharArray();
        int x = 0;
        for (int i = ch.length - 1; i >= 0 ; i--) {
            int a = ch[i] - 'A' + 1;
            aus += Math.pow(26,x)*a;
            x++;
        }
        return aus;
    }
}
