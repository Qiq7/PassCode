package javaxm3.sbww;

public class MyLeetCode0133 {
    public static void main(String[] args) {
        System.out.println(convertToTitle(701));
    }
    public static int get(int x)
    {
        return x==0 ? 25:x-1;
    }
    public static String convertToTitle(int columnNumber) {
        StringBuffer sb = new StringBuffer();
        while (columnNumber!=0)
        {
            int x = columnNumber%26;
            sb.append((char)('A'+get(x)));
            columnNumber -= get(x);
            columnNumber /= 26;
        }
        return sb.reverse().toString();
    }
}
