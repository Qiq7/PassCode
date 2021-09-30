package javaxm3.sbww;
//over#402
public class MyLeetCode0001 {
    public static void main(String[] args) {
        String s="01";
        System.out.println(RemoveKdigits(s,1));
    }
    public static String RemoveKdigits(String num,int k)
    {
        char c;
        String  s="";int t=k,n=num.length();
        if(k>=num.length())
        {
            return "0";
        }else {
            int T=0;
            c=num.charAt(T);
            int a = num.length()-t;//还需要数字的个数
            for (int i=0;i < num.length()-k;i++) {
                if(a>0)
                {
                    for (int j = T; j <= n-a ; j++) {
                        if(num.charAt(j)<c)
                        {
                            T=j;
                            c=num.charAt(T);
                        }
                    }
                    System.out.println(c+"  "+T+"  "+(n-a));
                    if(!(s==""&&c=='0'))
                    {
                        s=s+c;
                    }
                    if(T<num.length()-1)
                    {
                        T++;
                        c=num.charAt(T);
                    }
                }
                a--;
            }

        }
        if(s=="") s="0";
        return s;
    }

}
