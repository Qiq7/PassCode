package javaxm3.sbww;
//overtime#738
public class MyLeetCode0032 {
    public static void main(String[] args) {
        System.out.println(monotoneIncreasingDigits(10));
    }
    public static int monotoneIncreasingDigits(int N)
    {
        int n=N;
        if (n<10) return n;
        for (int i=N;i>=0;i--)
        {
         if(isok(i))
         {
             n=i;
             break;
         }
        }
        return n;
    }
    public static boolean isok(int n)
    {
        String s=new String(String.valueOf(n));
        char[] ch=s.toCharArray();
        for (int i = 1; i < ch.length; i++) {
            if(ch[i]<ch[i-1])
            {
                return false;
            }
        }
        return true;
    }
}

