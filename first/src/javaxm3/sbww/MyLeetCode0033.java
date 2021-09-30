package javaxm3.sbww;
//over#738
public class MyLeetCode0033 {
    public static void main(String[] args) {
        System.out.println(monotoneIncreasingDigits(10));
    }
    public static int monotoneIncreasingDigits(int N)
    {
        char[] ch=Integer.toString(N).toCharArray();
        int i=1;
        while (i<ch.length&&ch[i]>=ch[i-1])
        {
            i++;
        }
        if (i<ch.length)
        {
            while (i>0&&ch[i]<ch[i-1])
            {
                ch[i-1]--;
                i--;
            }
            i++;
            while (i<ch.length)
            {
                ch[i]='9';
                i++;
            }
        }
        return Integer.parseInt(new String(ch));
    }
}
