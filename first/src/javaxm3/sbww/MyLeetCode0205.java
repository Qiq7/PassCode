package javaxm3.sbww;

public class MyLeetCode0205 {
    public static void main(String[] args) {

    }
    static final int MOD = 1000000000+7;
    public int numDecodings(String s) {
        long a=0,b=1,c=0;
        int n = s.length();
        for (int i = 1; i <= n ; i++) {
            c = b*checkDigit(s.charAt(i-1))%MOD;
            if(i>1)
            {
                c=(c+a*checkDigit2(s.charAt(i-2),s.charAt(i-1)))%MOD;
            }
            a= b;
            b=c;
        }
        return (int) c;
    }
    public int checkDigit(char a)
    {
        if(a=='0')
        {
            return 0;
        }
        return a=='*'?9:1;
    }
    public int checkDigit2(char ch1,char ch2)
    {
        if(ch1=='*'&&ch2=='*')
        {
            return 15;
        }
        if(ch1=='*')
        {
            return ch2<='6'?2:1;
        }
        if(ch2=='*')
        {
            if(ch1=='1')
            {
                return 9;
            }
            if (ch1=='2')
            {
                return 6;
            }
            return 0;
        }
        return (ch1!='0')&&((ch1-'0')*10+ch2-'0')<=26?1:0;
    }
}
